module org.glassfish.jersey.test.framework.test.framework.core {

        requires public javax.servlet.api;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.server;
       requires public testng;
        requires public junit;

       exports org.glassfish.jersey.test;
       exports org.glassfish.jersey.test.spi;
}

