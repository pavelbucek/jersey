module org.glassfish.jersey.containers.container.simple.http {

       requires public javax.inject;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;
       requires public simple;

       exports org.glassfish.jersey.simple;

       provides org.glassfish.jersey.server.spi.ContainerProvider with org.glassfish.jersey.simple.SimpleContainerProvider;

}
