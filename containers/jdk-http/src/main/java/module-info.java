module org.glassfish.jersey.containers.container.jdk.http {

       requires transitive javax.ws.rs.api;
       requires transitive jdk.httpserver;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.jdkhttp;

       provides org.glassfish.jersey.server.spi.ContainerProvider with org.glassfish.jersey.jdkhttp.JdkHttpHandlerContainerProvider;

}
