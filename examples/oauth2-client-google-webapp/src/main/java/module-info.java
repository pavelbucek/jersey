module org.glassfish.jersey.examples.oauth2.client.google.webapp {

       requires public org.glassfish.jersey.containers.container.grizzly2.servlet;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.mvc.bean.validation;
       requires public org.glassfish.jersey.ext.mvc.mustache;
       requires public org.glassfish.jersey.media.media.json.jackson;
       requires public org.glassfish.jersey.security.oauth2.client;

       exports org.glassfish.jersey.examples.oauth2.googleclient;
       exports org.glassfish.jersey.examples.oauth2.googleclient.entity;
       exports org.glassfish.jersey.examples.oauth2.googleclient.model;
       exports org.glassfish.jersey.examples.oauth2.googleclient.resource;
}

