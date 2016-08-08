module org.glassfish.jersey.tests.integration.spring4 {

       requires transitive commons.logging;
       requires transitive javax.servlet.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.ext.spring4;

       exports org.glassfish.jersey.server.spring.test;

}
