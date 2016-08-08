module org.glassfish.jersey.examples.extended.wadl.webapp {

       requires transitive jettison;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.servlet;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.wadl.doclet;
       requires transitive validation.api;

       exports org.glassfish.jersey.examples.extendedwadl;
       exports org.glassfish.jersey.examples.extendedwadl.resources;
       exports org.glassfish.jersey.examples.extendedwadl.util;

}
