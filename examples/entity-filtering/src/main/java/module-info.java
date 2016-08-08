module org.glassfish.jersey.examples.entity.filtering {

       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.entity.filtering;
       requires public org.glassfish.jersey.media.media.json.jackson;
       requires public org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.entityfiltering;
       exports org.glassfish.jersey.examples.entityfiltering.domain;
       exports org.glassfish.jersey.examples.entityfiltering.filtering;
       exports org.glassfish.jersey.examples.entityfiltering.resource;
}

