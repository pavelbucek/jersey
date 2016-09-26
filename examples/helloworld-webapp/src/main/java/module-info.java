module org.glassfish.jersey.examples.helloworld.webapp {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.servlet;

       exports org.glassfish.jersey.examples.helloworld.webapp;

}
