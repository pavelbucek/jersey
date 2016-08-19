module org.glassfish.jersey.ext.bean.validation {

       requires public hibernate.validator;
       requires public javax.el;
       requires public javax.el.api;
       requires public javax.inject;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;
       requires public validation.api;

       exports org.glassfish.jersey.server.validation;
       exports org.glassfish.jersey.server.validation.internal;

        uses javax.validation.spi.ValidationProvider;

       provides org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable with org.glassfish.jersey.server.validation.internal.ValidationAutoDiscoverable;

}
