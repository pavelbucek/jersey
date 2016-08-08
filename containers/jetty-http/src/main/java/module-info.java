module org.glassfish.jersey.containers.container.jetty.http {

        requires public javax.servlet.api;
        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.server;
        requires public org.glassfish.jersey.core.common;

       requires public javax.inject;
       requires public jetty.continuation;
       requires public jetty.server;
       requires public jetty.util;
       requires public jetty.http;

       exports org.glassfish.jersey.jetty;
}

