module org.glassfish.jersey.ext.spring4 {

       requires public hk2;
       requires public javax.servlet.api;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.core.server;
       requires public spring.beans;
       requires public spring.bridge;
       requires public spring.core;
       requires public spring.web;
        requires public spring.context;

       exports org.glassfish.jersey.server.spring;
       exports org.glassfish.jersey.server.spring.scope;
}

