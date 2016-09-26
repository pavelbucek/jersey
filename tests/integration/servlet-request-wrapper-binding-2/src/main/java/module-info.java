module org.glassfish.jersey.tests.integration.servlet.request.wrappper.binding.2 {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.ext.servlet.portability;

       exports org.glassfish.jersey.tests.integration.servlet_request_wrapper_binding2;

       provides org.glassfish.jersey.server.spi.ComponentProvider with org.glassfish.jersey.tests.integration.servlet_request_wrapper_binding2.RequestResponseWrapperProvider$DescriptorProvider;
       provides org.glassfish.jersey.servlet.internal.spi.ServletContainerProvider with org.glassfish.jersey.tests.integration.servlet_request_wrapper_binding2.RequestResponseWrapperProvider;

}
