module org.glassfish.jersey.examples.oauth.client.twitter {

       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.media.media.json.jackson;
       requires transitive org.glassfish.jersey.security.oauth1.client;

       exports org.glassfish.jersey.examples.oauth.twitterclient;

}
