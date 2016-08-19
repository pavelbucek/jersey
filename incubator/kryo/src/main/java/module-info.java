module org.glassfish.jersey.media.media.kryo {

       requires public javax.ws.rs.api;
       requires public kryo;
       requires public org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.kryo;
       exports org.glassfish.jersey.kryo.internal;

       provides org.glassfish.jersey.internal.spi.AutoDiscoverable with org.glassfish.jersey.kryo.internal.KryoAutoDiscoverable;

}
