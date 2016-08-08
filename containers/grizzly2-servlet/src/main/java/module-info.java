module org.glassfish.jersey.containers.container.grizzly2.servlet {

        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.server;
        requires public org.glassfish.jersey.core.common;

       requires public grizzly.http.servlet;
       requires public javax.servlet.api;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.containers.container.servlet;

       exports org.glassfish.jersey.grizzly2.servlet;
}

