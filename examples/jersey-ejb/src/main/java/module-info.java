module org.glassfish.jersey.examples.ejb {

       requires transitive javax.ejb.api;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.examples.jersey_ejb.entities;
       exports org.glassfish.jersey.examples.jersey_ejb.exceptions;
       exports org.glassfish.jersey.examples.jersey_ejb.resources;

}
