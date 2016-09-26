module org.glassfish.jersey.examples.json.processing.webapp {

       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.media.media.json.processing;

       exports org.glassfish.jersey.examples.jsonp;
       exports org.glassfish.jersey.examples.jsonp.resource;
       exports org.glassfish.jersey.examples.jsonp.service;

}
