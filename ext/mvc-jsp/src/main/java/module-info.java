module org.glassfish.jersey.ext.mvc.jsp {

       requires public javax.inject;
       requires public jsp.api;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.ext.mvc;
        requires public javax.servlet.api;

       exports org.glassfish.jersey.server.mvc.jsp;
}

