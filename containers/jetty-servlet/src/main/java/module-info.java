module org.glassfish.jersey.containers.container.jetty.servlet {

       requires transitive javax.ws.rs.api;
       requires transitive jetty.servlet;
       requires transitive jetty.webapp;
       requires transitive org.glassfish.jersey.containers.container.jetty.http;
       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.jetty.servlet;

}
