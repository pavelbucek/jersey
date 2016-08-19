module org.glassfish.jersey.containers.container.jetty.http {

       requires public javax.inject;
       requires public javax.servlet.api;
       requires public javax.ws.rs.api;
       requires public jetty.continuation;
       requires public jetty.http;
       requires public jetty.server;
       requires public jetty.util;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.jetty;

       provides org.glassfish.jersey.server.spi.ContainerProvider with org.glassfish.jersey.jetty.JettyHttpContainerProvider;

}
