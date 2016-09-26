module org.glassfish.jersey.examples.http.patch {

       requires transitive jackson.core;
       requires transitive jackson.databind;
       requires transitive json.patch;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.httppatch;

}
