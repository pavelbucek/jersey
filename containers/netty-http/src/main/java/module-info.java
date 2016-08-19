module org.glassfish.jersey.containers.container.netty.http {

       requires public javax.inject;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.connectors.netty.connector;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.netty.httpserver;

       provides org.glassfish.jersey.server.spi.ContainerProvider with org.glassfish.jersey.netty.httpserver.NettyHttpContainerProvider;

}
