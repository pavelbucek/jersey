module org.glassfish.jersey.ext.servlet.portability {

       requires public javax.ws.rs.api;
       requires public jersey.servlet;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public javax.servlet.api;

       exports org.glassfish.jersey.servlet.portability;
}

