module org.glassfish.jersey.ext.spring4 {

       requires transitive hk;
       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive spring.aop;
       requires transitive spring.beans;
       requires transitive spring.bridge;
       requires transitive spring.context;
       requires transitive spring.core;
       requires transitive spring.web;

       exports org.glassfish.jersey.server.spring;
       exports org.glassfish.jersey.server.spring.scope;

       provides org.glassfish.jersey.server.spi.ComponentProvider with org.glassfish.jersey.server.spring.SpringComponentProvider;

}
