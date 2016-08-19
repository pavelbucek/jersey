module org.glassfish.jersey.tests.integration.j.441.war1 {

       requires public cdi.api;
       requires public javax.servlet.api;
       requires public org.glassfish.jersey.containers.container.servlet;

       exports org.glassfish.jersey.tests.integration.j441.one;

}
