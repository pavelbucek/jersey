module org.glassfish.jersey.containers.container.servlet.core {

       requires public java.naming;
       requires public javax.inject;
       requires public javax.servlet.api;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;
       requires public persistence.api;

       exports org.glassfish.jersey.servlet;
       exports org.glassfish.jersey.servlet.internal;
       exports org.glassfish.jersey.servlet.internal.spi;
       exports org.glassfish.jersey.servlet.spi;

        uses org.glassfish.jersey.servlet.internal.spi.ServletContainerProvider;
        uses org.glassfish.jersey.servlet.spi.AsyncContextDelegateProvider;
        uses org.glassfish.jersey.servlet.spi.FilterUrlMappingsProvider;

}
