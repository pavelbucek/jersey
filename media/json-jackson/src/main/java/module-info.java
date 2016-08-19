module org.glassfish.jersey.media.media.json.jackson {

       requires public jackson.annotations;
       requires public jackson.core;
       requires public jackson.databind;
       requires public jackson.jaxrs.base;
       requires public jackson.jaxrs.json.provider;
       requires public jackson.module.jaxb.annotations;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.ext.entity.filtering;

       exports org.glassfish.jersey.jackson;
       exports org.glassfish.jersey.jackson.internal;

       provides org.glassfish.jersey.internal.spi.AutoDiscoverable with org.glassfish.jersey.jackson.internal.JacksonAutoDiscoverable;

}
