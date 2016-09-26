module org.glassfish.jersey.tests.integration.portability.1 {

       requires transitive jersey.servlet;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.servlet.portability;

       exports org.glassfish.jersey.tests.integration.portability;

}
