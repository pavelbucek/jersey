module org.glassfish.jersey.containers.container.servlet {

       requires transitive javax.servlet.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.servlet.async;
       exports org.glassfish.jersey.servlet.init;

       provides javax.servlet.ServletContainerInitializer with org.glassfish.jersey.servlet.init.JerseyServletContainerInitializer;
       provides org.glassfish.jersey.servlet.spi.AsyncContextDelegateProvider with org.glassfish.jersey.servlet.async.AsyncContextDelegateProviderImpl;
       provides org.glassfish.jersey.servlet.spi.FilterUrlMappingsProvider with org.glassfish.jersey.servlet.init.FilterUrlMappingsProviderImpl;

}
