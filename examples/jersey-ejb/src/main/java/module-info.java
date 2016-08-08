module org.glassfish.jersey.examples.ejb {

       requires public javax.ejb.api;
       requires public org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.examples.jersey_ejb.entities;
       exports org.glassfish.jersey.examples.jersey_ejb.exceptions;
       exports org.glassfish.jersey.examples.jersey_ejb.resources;
}

