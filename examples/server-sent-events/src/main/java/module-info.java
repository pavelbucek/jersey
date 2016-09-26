module org.glassfish.jersey.examples.server.sent.events {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.media.media.sse;

       exports org.glassfish.jersey.examples.sse;

}
