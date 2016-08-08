module org.glassfish.jersey.containers.container.servlet.core {

       requires transitive java.naming;
       requires transitive javax.inject;
       requires transitive javax.servlet.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive persistence.api;

       exports org.glassfish.jersey.servlet;
       exports org.glassfish.jersey.servlet.internal;
       exports org.glassfish.jersey.servlet.internal.spi;
       exports org.glassfish.jersey.servlet.spi;

        uses org.glassfish.jersey.servlet.internal.spi.ServletContainerProvider;
        uses org.glassfish.jersey.servlet.spi.AsyncContextDelegateProvider;
        uses org.glassfish.jersey.servlet.spi.FilterUrlMappingsProvider;

}
