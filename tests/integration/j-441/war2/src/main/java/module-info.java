module org.glassfish.jersey.tests.integration.j.441.war2 {

       requires transitive cdi.api;
       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet;

       exports org.glassfish.jersey.tests.integration.j441.two;

}
