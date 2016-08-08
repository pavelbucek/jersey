module org.glassfish.jersey.containers.container.grizzly2.servlet {

       requires transitive grizzly.http.servlet;
       requires transitive javax.servlet.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.grizzly2.servlet;

}
