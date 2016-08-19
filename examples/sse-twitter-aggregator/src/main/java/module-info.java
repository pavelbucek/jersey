module org.glassfish.jersey.examples.sse.twitter.aggregator {

       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.media.media.moxy;
       requires public org.glassfish.jersey.media.media.sse;
       requires public swing.layout;

       exports org.glassfish.jersey.examples.aggregator;

}
