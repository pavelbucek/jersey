module org.glassfish.jersey.tests.integration.servlet.3.init.4 {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet;

       exports org.glassfish.jersey.tests.integration.servlet_3_init_4;
       exports org.glassfish.jersey.tests.integration.servlet_3_init_4.resource;

}
