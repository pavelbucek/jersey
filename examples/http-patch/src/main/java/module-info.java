module org.glassfish.jersey.examples.http.patch {

       requires public jackson.core;
       requires public jackson.databind;
       requires public json.patch;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.httppatch;

}
