module org.glassfish.jersey.tests.integration.portability.2 {

       requires transitive jersey.servlet;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.ext.servlet.portability;

       exports org.glassfish.jersey.tests.integration.portability;

}
