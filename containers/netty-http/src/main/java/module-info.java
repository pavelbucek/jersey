module org.glassfish.jersey.containers.container.netty.http {

        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.server;
        requires public org.glassfish.jersey.core.common;

       requires public javax.inject;
       requires public org.glassfish.jersey.connectors.netty.connector;

       exports org.glassfish.jersey.netty.httpserver;
}

