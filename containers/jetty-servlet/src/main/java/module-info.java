module org.glassfish.jersey.containers.container.jetty.servlet {

        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.server;
        requires public org.glassfish.jersey.core.common;

       requires public jetty.webapp;
        requires public jetty.servlet;
       requires public org.glassfish.jersey.containers.container.jetty.http;
       requires public org.glassfish.jersey.containers.container.servlet;

       exports org.glassfish.jersey.jetty.servlet;
}

