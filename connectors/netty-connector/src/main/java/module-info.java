module org.glassfish.jersey.connectors.netty.connector {

        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.client;
        requires public org.glassfish.jersey.core.common;

       requires public netty.all;

       exports org.glassfish.jersey.netty.connector;
       exports org.glassfish.jersey.netty.connector.internal;
}

