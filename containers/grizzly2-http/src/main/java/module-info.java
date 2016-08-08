module org.glassfish.jersey.containers.container.grizzly2.http {

       requires transitive grizzly.framework;
       requires transitive grizzly.http;
       requires transitive grizzly.http.server;
       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.grizzly2.httpserver;

       provides org.glassfish.jersey.server.spi.ContainerProvider with org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpContainerProvider;

}
