module org.glassfish.jersey.examples.oauth2.client.google.webapp {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.servlet;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.mvc.bean.validation;
       requires transitive org.glassfish.jersey.ext.mvc.mustache;
       requires transitive org.glassfish.jersey.media.media.json.jackson;
       requires transitive org.glassfish.jersey.security.oauth2.client;

       exports org.glassfish.jersey.examples.oauth2.googleclient;
       exports org.glassfish.jersey.examples.oauth2.googleclient.entity;
       exports org.glassfish.jersey.examples.oauth2.googleclient.model;
       exports org.glassfish.jersey.examples.oauth2.googleclient.resource;

}
