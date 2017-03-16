/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package org.glassfish.jersey.message.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

import javax.ws.rs.Flow;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;

/**
 * @author Pavel Bucek (pavel.bucek at oracle.com)
 */
public class ByteBufferSourceWriter implements MessageBodyWriter<Flow.Source<ByteBuffer>> {

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {

        return Flow.Source.class.equals(type) && ByteBuffer.class
                .equals(((ParameterizedType) genericType).getActualTypeArguments()[0]);
    }

    @Override
    public long getSize(Flow.Source<ByteBuffer> byteBufferSource,
                        Class<?> type,
                        Type genericType,
                        Annotation[] annotations,
                        MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(Flow.Source<ByteBuffer> byteBufferSource,
                        Class<?> type,
                        Type genericType,
                        Annotation[] annotations,
                        MediaType mediaType,
                        MultivaluedMap<String, Object> httpHeaders,
                        OutputStream entityStream) throws IOException, WebApplicationException {

        CountDownLatch written = new CountDownLatch(1);

        byteBufferSource.subscribe(new Flow.Sink<ByteBuffer>() {

            final byte[] buffer = new byte[256];

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                subscription.request(Long.MAX_VALUE);
            }

            @Override
            public void onNext(ByteBuffer item) {
                try {
                    while (item.remaining() > 0) {
                        int remaining = item.remaining();

                        if (remaining >= buffer.length) {
                            ByteBuffer byteBuffer = item.get(buffer, 0, buffer.length);
                            entityStream.write(buffer, 0, buffer.length);
                        } else {
                            ByteBuffer byteBuffer = item.get(buffer, 0, remaining);
                            entityStream.write(buffer, 0, remaining);
                        }
                    }
                } catch (IOException e) {
                    // ignore.
                }
            }


            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                try {
                    written.countDown();
                    entityStream.close();
                } catch (IOException e) {
                    // ignore.
                }
            }
        });

        try {
            written.await();
        } catch (InterruptedException e) {
            // ignore.
        }

    }
}
