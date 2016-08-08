module org.glassfish.jersey.tests.integration.spring4 {

       requires public commons.logging;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.containers.container.servlet;
       requires public org.glassfish.jersey.ext.spring4;
        requires public javax.servlet.api;

       exports org.glassfish.jersey.server.spring.test;
}

