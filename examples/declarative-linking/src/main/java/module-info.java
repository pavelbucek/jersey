module org.glassfish.jersey.examples.declarative.linking {

       requires transitive javax.el;
       requires transitive javax.el.api;
       requires transitive org.eclipse.persistence.moxy;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.ext.declarative.linking;
       requires transitive org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.linking;
       exports org.glassfish.jersey.examples.linking.model;
       exports org.glassfish.jersey.examples.linking.representation;
       exports org.glassfish.jersey.examples.linking.resources;

}
