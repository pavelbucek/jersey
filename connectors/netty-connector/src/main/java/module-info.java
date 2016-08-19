module org.glassfish.jersey.connectors.netty.connector {

       requires public javax.ws.rs.api;
       requires public netty.all;
       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.netty.connector;
       exports org.glassfish.jersey.netty.connector.internal;

}
