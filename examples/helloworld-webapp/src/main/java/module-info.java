module org.glassfish.jersey.examples.helloworld.webapp {

       requires public javax.servlet.api;
       requires public org.glassfish.jersey.containers.container.grizzly2.servlet;

       exports org.glassfish.jersey.examples.helloworld.webapp;
}

