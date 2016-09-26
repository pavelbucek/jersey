module org.glassfish.jersey.tests.integration.servlet.request.wrappper.binding {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.ext.servlet.portability;

       exports org.glassfish.jersey.tests.integration.servlet_request_wrapper_binding;

       provides org.glassfish.jersey.servlet.internal.spi.ServletContainerProvider with org.glassfish.jersey.tests.integration.servlet_request_wrapper_binding.RequestResponseWrapperProvider;

}
