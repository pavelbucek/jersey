module org.glassfish.jersey.ext.bean.validation {

       requires transitive hibernate.validator;
       requires transitive javax.el;
       requires transitive javax.el.api;
       requires transitive javax.inject;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive validation.api;

       exports org.glassfish.jersey.server.validation;
       exports org.glassfish.jersey.server.validation.internal;

        uses javax.validation.spi.ValidationProvider;

       provides org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable with org.glassfish.jersey.server.validation.internal.ValidationAutoDiscoverable;

}
