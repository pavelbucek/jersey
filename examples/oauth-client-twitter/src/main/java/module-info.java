module org.glassfish.jersey.examples.oauth.client.twitter {

       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.media.media.json.jackson;
       requires public org.glassfish.jersey.security.oauth1.client;

       exports org.glassfish.jersey.examples.oauth.twitterclient;
}

