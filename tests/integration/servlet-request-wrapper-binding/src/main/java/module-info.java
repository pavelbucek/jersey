module org.glassfish.jersey.tests.integration.servlet.request.wrappper.binding {

       requires public javax.servlet.api;
       requires public org.glassfish.jersey.containers.container.servlet;
       requires public org.glassfish.jersey.ext.servlet.portability;

       exports org.glassfish.jersey.tests.integration.servlet_request_wrapper_binding;
}

