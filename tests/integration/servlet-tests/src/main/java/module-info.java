module org.glassfish.jersey.tests.integration.servlet.tests {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.tests.integration.servlettests;

}
