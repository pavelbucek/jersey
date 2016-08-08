module org.glassfish.jersey.media.media.json.jackson {

       requires public jackson.annotations;
       requires public jackson.jaxrs.base;
       requires public jackson.jaxrs.json.provider;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.ext.entity.filtering;

        requires public jackson.core;
        requires public jackson.databind;
        requires public jackson.module.jaxb.annotations;

       exports org.glassfish.jersey.jackson;
       exports org.glassfish.jersey.jackson.internal;
}

