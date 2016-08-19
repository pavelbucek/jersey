module org.glassfish.jersey.containers.container.jdk.http {

       requires public javax.ws.rs.api;
       requires public jdk.httpserver;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.jdkhttp;

       provides org.glassfish.jersey.server.spi.ContainerProvider with org.glassfish.jersey.jdkhttp.JdkHttpHandlerContainerProvider;

}
