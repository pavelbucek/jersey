module org.glassfish.jersey.containers.container.servlet {

       requires public javax.servlet.api;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.servlet.async;
       exports org.glassfish.jersey.servlet.init;

       provides javax.servlet.ServletContainerInitializer with org.glassfish.jersey.servlet.init.JerseyServletContainerInitializer;
       provides org.glassfish.jersey.servlet.spi.AsyncContextDelegateProvider with org.glassfish.jersey.servlet.async.AsyncContextDelegateProviderImpl;
       provides org.glassfish.jersey.servlet.spi.FilterUrlMappingsProvider with org.glassfish.jersey.servlet.init.FilterUrlMappingsProviderImpl;

}
