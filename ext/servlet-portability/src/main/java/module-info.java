module org.glassfish.jersey.ext.servlet.portability {

       requires public javax.servlet.api;
       requires public javax.ws.rs.api;
       requires public jersey.servlet;
       requires public org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.servlet.portability;

}
