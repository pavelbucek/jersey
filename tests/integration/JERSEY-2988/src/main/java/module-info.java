module org.glassfish.jersey.tests.integration.2988 {

       requires transitive cdi.api;
       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;
       requires transitive weld.servlet.core;

       exports org.glassfish.jersey.tests.integration.jersey2988;

}
