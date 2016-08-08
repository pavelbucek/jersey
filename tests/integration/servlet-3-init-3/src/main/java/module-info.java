module org.glassfish.jersey.tests.integration.servlet.3.init.3 {

       requires public javax.servlet.api;
       requires public org.glassfish.jersey.containers.container.servlet;

       exports org.glassfish.jersey.tests.integration.servlet_3_init_3;
       exports org.glassfish.jersey.tests.integration.servlet_3_init_3.resource;
}

