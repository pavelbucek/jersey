module org.glassfish.jersey.media.media.sse {

       requires public javax.inject;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.media.sse;
       exports org.glassfish.jersey.media.sse.internal;

       provides org.glassfish.jersey.internal.spi.AutoDiscoverable with org.glassfish.jersey.media.sse.internal.SseAutoDiscoverable;

}
