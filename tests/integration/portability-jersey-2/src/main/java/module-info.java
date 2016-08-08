module org.glassfish.jersey.tests.integration.portability.2 {

       requires public jersey.servlet;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.ext.servlet.portability;

       exports org.glassfish.jersey.tests.integration.portability;
}

