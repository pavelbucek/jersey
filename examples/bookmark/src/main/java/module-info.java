module org.glassfish.jersey.examples.bookmark {

       requires transitive java.naming;
       requires transitive jta;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.media.media.json.jettison;
       requires transitive persistence.api;

       exports org.glassfish.jersey.examples.bookmark;
       exports org.glassfish.jersey.examples.bookmark.entity;
       exports org.glassfish.jersey.examples.bookmark.exception;
       exports org.glassfish.jersey.examples.bookmark.resource;
       exports org.glassfish.jersey.examples.bookmark.util.tx;

}
