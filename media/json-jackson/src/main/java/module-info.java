module org.glassfish.jersey.media.media.json.jackson {

       requires transitive jackson.annotations;
       requires transitive jackson.core;
       requires transitive jackson.databind;
       requires transitive jackson.jaxrs.base;
       requires transitive jackson.jaxrs.json.provider;
       requires transitive jackson.module.jaxb.annotations;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.ext.entity.filtering;

       exports org.glassfish.jersey.jackson;
       exports org.glassfish.jersey.jackson.internal;

       provides org.glassfish.jersey.internal.spi.AutoDiscoverable with org.glassfish.jersey.jackson.internal.JacksonAutoDiscoverable;

}
