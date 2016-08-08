module org.glassfish.jersey.containers.container.grizzly2.http {

        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.server;
        requires public org.glassfish.jersey.core.common;

       requires public grizzly.http.server;
        requires public grizzly.framework;
        requires public grizzly.http;
       requires public javax.inject;

       exports org.glassfish.jersey.grizzly2.httpserver;
}

