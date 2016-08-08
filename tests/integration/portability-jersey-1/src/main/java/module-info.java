module org.glassfish.jersey.tests.integration.portability.1 {

       requires public jersey.servlet;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.servlet.portability;

       exports org.glassfish.jersey.tests.integration.portability;
}

