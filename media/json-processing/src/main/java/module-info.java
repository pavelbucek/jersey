module org.glassfish.jersey.media.media.json.processing {

       requires public javax.json;
       requires public jsonp.jaxrs;
       requires public org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.jsonp;
       exports org.glassfish.jersey.jsonp.internal;
}

