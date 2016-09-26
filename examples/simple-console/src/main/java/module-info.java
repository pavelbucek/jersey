module org.glassfish.jersey.examples.simple.console {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.media.media.json.jettison;

       exports org.glassfish.jersey.examples.console;
       exports org.glassfish.jersey.examples.console.resources;

}
