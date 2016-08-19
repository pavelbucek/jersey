module org.glassfish.jersey.containers.container.jetty.servlet {

       requires public javax.ws.rs.api;
       requires public jetty.servlet;
       requires public jetty.webapp;
       requires public org.glassfish.jersey.containers.container.jetty.http;
       requires public org.glassfish.jersey.containers.container.servlet;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.jetty.servlet;

}
