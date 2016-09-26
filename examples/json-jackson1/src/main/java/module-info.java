module org.glassfish.jersey.examples.json.jackson1 {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.media.media.json.jackson1;

       exports org.glassfish.jersey.examples.jackson1;

}
