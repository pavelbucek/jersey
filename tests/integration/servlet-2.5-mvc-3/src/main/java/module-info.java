module org.glassfish.jersey.tests.integration.servlet.2.5.mvc.3 {

       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.ext.mvc;
       requires public org.glassfish.jersey.ext.mvc.jsp;
        requires public javax.servlet.api;

       exports org.glassfish.jersey.tests.integration.servlet_25_mvc_3;
       exports org.glassfish.jersey.tests.integration.servlet_25_mvc_3.resource;
}

