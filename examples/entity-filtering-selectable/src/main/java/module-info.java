module org.glassfish.jersey.examples.entity.filtering.selectable {

       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.entity.filtering;
       requires public org.glassfish.jersey.media.media.json.jackson;
       requires public org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.entityfiltering.selectable;
       exports org.glassfish.jersey.examples.entityfiltering.selectable.domain;
       exports org.glassfish.jersey.examples.entityfiltering.selectable.resource;
}

