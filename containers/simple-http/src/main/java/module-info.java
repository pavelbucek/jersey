module org.glassfish.jersey.containers.container.simple.http {

       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive simple.common;
       requires transitive simple.http;
       requires transitive simple.transport;

       exports org.glassfish.jersey.simple;

       provides org.glassfish.jersey.server.spi.ContainerProvider with org.glassfish.jersey.simple.SimpleContainerProvider;

}
