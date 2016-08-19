module org.glassfish.jersey.media.media.json.processing {

       requires public javax.json;
       requires public jsonp.jaxrs;
       requires public org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.jsonp;
       exports org.glassfish.jersey.jsonp.internal;

       provides org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable with org.glassfish.jersey.jsonp.internal.JsonProcessingAutoDiscoverable;

}
