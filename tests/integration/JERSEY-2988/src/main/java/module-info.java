module org.glassfish.jersey.tests.integration.2988 {

       requires public cdi.api;
       requires public org.glassfish.jersey.containers.container.servlet;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
       requires public weld.servlet.core;

       exports org.glassfish.jersey.tests.integration.jersey2988;
}

