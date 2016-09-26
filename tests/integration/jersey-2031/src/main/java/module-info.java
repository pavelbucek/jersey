module org.glassfish.jersey.tests.integration.2031 {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.ext.mvc.jsp;

       exports org.glassfish.jersey.tests.integration.jersey2031;

}
