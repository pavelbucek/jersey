module org.glassfish.jersey.examples.flight.management.webapp {

       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.ext.bean.validation;
       requires transitive org.glassfish.jersey.ext.mvc.bean.validation;
       requires transitive org.glassfish.jersey.ext.mvc.freemarker;
       requires transitive org.glassfish.jersey.media.media.moxy;
       requires transitive org.glassfish.jersey.media.media.sse;

       exports org.glassfish.jersey.examples.flight;
       exports org.glassfish.jersey.examples.flight.filtering;
       exports org.glassfish.jersey.examples.flight.internal;
       exports org.glassfish.jersey.examples.flight.model;
       exports org.glassfish.jersey.examples.flight.providers;
       exports org.glassfish.jersey.examples.flight.resources;
       exports org.glassfish.jersey.examples.flight.validation;

}
