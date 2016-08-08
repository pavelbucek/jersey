module org.glassfish.jersey.examples.helloworld.spring.webapp {

       requires public commons.logging;
       requires public org.glassfish.jersey.containers.container.servlet;
       requires public org.glassfish.jersey.ext.spring4;
        // requires public servlet.api.2.5;
        requires public javax.servlet.api;
       requires public spring.web;

       exports org.glassfish.jersey.examples.helloworld.spring;
}

