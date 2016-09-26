module org.glassfish.jersey.examples.json.jackson {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.media.media.json.jackson;

       exports org.glassfish.jersey.examples.jackson;

}
