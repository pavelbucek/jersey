module org.glassfish.jersey.examples.http.patch {

       requires public json.patch;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.media.media.moxy;
        requires public jackson.databind;
        requires public jackson.core;

       exports org.glassfish.jersey.examples.httppatch;
}

