module org.glassfish.jersey.examples.extended.wadl.webapp {

       requires public jettison;
       requires public org.glassfish.jersey.containers.container.grizzly2.servlet;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.wadl.doclet;
       requires public validation.api;

       exports org.glassfish.jersey.examples.extendedwadl;
       exports org.glassfish.jersey.examples.extendedwadl.resources;
       exports org.glassfish.jersey.examples.extendedwadl.util;

}
