module org.glassfish.jersey.containers.container.netty.http {

       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.connectors.netty.connector;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.netty.httpserver;

       provides org.glassfish.jersey.server.spi.ContainerProvider with org.glassfish.jersey.netty.httpserver.NettyHttpContainerProvider;

}
