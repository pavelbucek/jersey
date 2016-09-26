module org.glassfish.jersey.ext.servlet.portability {

       requires transitive javax.servlet.api;
       requires transitive javax.ws.rs.api;
       requires transitive jersey.servlet;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.servlet.portability;

}
