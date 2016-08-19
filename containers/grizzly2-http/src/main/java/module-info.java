module org.glassfish.jersey.containers.container.grizzly2.http {

       requires public grizzly.framework;
       requires public grizzly.http;
       requires public grizzly.http.server;
       requires public javax.inject;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.grizzly2.httpserver;

       provides org.glassfish.jersey.server.spi.ContainerProvider with org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpContainerProvider;

}
