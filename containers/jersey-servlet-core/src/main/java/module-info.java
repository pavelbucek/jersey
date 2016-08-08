module org.glassfish.jersey.containers.container.servlet.core {

        requires public java.naming;

        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.server;
        requires public org.glassfish.jersey.core.common;

       requires public javax.inject;
       requires public persistence.api;
         // requires public servlet.api;
         requires public javax.servlet.api;

       exports org.glassfish.jersey.servlet;
       exports org.glassfish.jersey.servlet.internal;
       exports org.glassfish.jersey.servlet.internal.spi;
       exports org.glassfish.jersey.servlet.spi;
}

