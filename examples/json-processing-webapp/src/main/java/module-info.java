module org.glassfish.jersey.examples.json.processing.webapp {

       requires public org.glassfish.jersey.media.media.json.processing;
        requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.examples.jsonp;
       exports org.glassfish.jersey.examples.jsonp.resource;
       exports org.glassfish.jersey.examples.jsonp.service;
}

