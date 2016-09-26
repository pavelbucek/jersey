module org.glassfish.jersey.containers.container.jetty.http {

       requires transitive javax.inject;
       requires transitive javax.servlet.api;
       requires transitive javax.ws.rs.api;
       requires transitive jetty.continuation;
       requires transitive jetty.http;
       requires transitive jetty.server;
       requires transitive jetty.util;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.jetty;

       provides org.glassfish.jersey.server.spi.ContainerProvider with org.glassfish.jersey.jetty.JettyHttpContainerProvider;

}
