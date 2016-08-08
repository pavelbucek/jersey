module org.glassfish.jersey.media.media.json.processing {

       requires transitive javax.json;
       requires transitive jsonp.jaxrs;
       requires transitive org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.jsonp;
       exports org.glassfish.jersey.jsonp.internal;

       provides org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable with org.glassfish.jersey.jsonp.internal.JsonProcessingAutoDiscoverable;

}
