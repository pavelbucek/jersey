module org.glassfish.jersey.tests.integration.servlet.2.5.mvc.1 {

       requires public javax.servlet.api;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.ext.mvc;
       requires public org.glassfish.jersey.ext.mvc.jsp;

       exports org.glassfish.jersey.tests.integration.servlet_25_mvc_1;
       exports org.glassfish.jersey.tests.integration.servlet_25_mvc_1.resource;

}
