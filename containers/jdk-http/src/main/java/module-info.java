module org.glassfish.jersey.containers.container.jdk.http {

         requires public jdk.httpserver;

        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.server;
        requires public org.glassfish.jersey.core.common;

        exports org.glassfish.jersey.jdkhttp;
}

