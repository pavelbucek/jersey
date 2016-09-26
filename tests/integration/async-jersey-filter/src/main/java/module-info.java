module org.glassfish.jersey.tests.integration.async.filter {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet;

       exports org.glassfish.jersey.tests.integration.async;
       exports org.glassfish.jersey.tests.integration.jersey2730;
       exports org.glassfish.jersey.tests.integration.jersey2730.exception;
       exports org.glassfish.jersey.tests.integration.jersey2812;

}
