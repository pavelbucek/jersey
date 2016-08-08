module org.glassfish.jersey.containers.container.servlet {

        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.server;
        requires public org.glassfish.jersey.core.common;

       requires public javax.servlet.api;
       requires public org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.servlet.async;
       exports org.glassfish.jersey.servlet.init;
}

