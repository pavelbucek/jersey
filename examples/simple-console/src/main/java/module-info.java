module org.glassfish.jersey.examples.simple.console {

       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.media.media.json.jettison;

       exports org.glassfish.jersey.examples.console;
       exports org.glassfish.jersey.examples.console.resources;
}

