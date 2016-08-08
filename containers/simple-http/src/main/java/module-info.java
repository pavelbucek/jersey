module org.glassfish.jersey.containers.container.simple.http {

        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.server;
        requires public org.glassfish.jersey.core.common;

       requires public javax.inject;
       requires public simple;

       exports org.glassfish.jersey.simple;
}

