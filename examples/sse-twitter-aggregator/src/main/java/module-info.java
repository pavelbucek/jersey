module org.glassfish.jersey.examples.sse.twitter.aggregator {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.media.media.moxy;
       requires transitive org.glassfish.jersey.media.media.sse;
       requires transitive swing.layout;

       exports org.glassfish.jersey.examples.aggregator;

}
