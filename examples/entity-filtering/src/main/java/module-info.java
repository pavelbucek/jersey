module org.glassfish.jersey.examples.entity.filtering {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.entity.filtering;
       requires transitive org.glassfish.jersey.media.media.json.jackson;
       requires transitive org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.entityfiltering;
       exports org.glassfish.jersey.examples.entityfiltering.domain;
       exports org.glassfish.jersey.examples.entityfiltering.filtering;
       exports org.glassfish.jersey.examples.entityfiltering.resource;

}
