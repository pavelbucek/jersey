module org.glassfish.jersey.tests.integration.servlet.2.5.mvc.3 {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.ext.mvc;
       requires transitive org.glassfish.jersey.ext.mvc.jsp;

       exports org.glassfish.jersey.tests.integration.servlet_25_mvc_3;
       exports org.glassfish.jersey.tests.integration.servlet_25_mvc_3.resource;

}
