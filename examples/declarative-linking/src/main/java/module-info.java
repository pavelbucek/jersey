module org.glassfish.jersey.examples.declarative.linking {

       requires public javax.el;
       requires public javax.el.api;
       requires public org.eclipse.persistence.moxy;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.ext.declarative.linking;
       requires public org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.linking;
       exports org.glassfish.jersey.examples.linking.model;
       exports org.glassfish.jersey.examples.linking.representation;
       exports org.glassfish.jersey.examples.linking.resources;
}

