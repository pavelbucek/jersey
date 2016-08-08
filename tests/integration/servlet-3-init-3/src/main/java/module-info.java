module org.glassfish.jersey.tests.integration.servlet.3.init.3 {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet;

       exports org.glassfish.jersey.tests.integration.servlet_3_init_3;
       exports org.glassfish.jersey.tests.integration.servlet_3_init_3.resource;

}
