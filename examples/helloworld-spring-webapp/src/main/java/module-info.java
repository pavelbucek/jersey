module org.glassfish.jersey.examples.helloworld.spring.webapp {

       requires transitive commons.logging;
       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.ext.spring4;
       requires transitive spring.web;

       exports org.glassfish.jersey.examples.helloworld.spring;

}
