module org.glassfish.jersey.examples.entity.filtering.security {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.entity.filtering;
       requires transitive org.glassfish.jersey.media.media.json.jackson;
       requires transitive org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.entityfiltering.security;
       exports org.glassfish.jersey.examples.entityfiltering.security.domain;
       exports org.glassfish.jersey.examples.entityfiltering.security.provider;
       exports org.glassfish.jersey.examples.entityfiltering.security.resource;

}
