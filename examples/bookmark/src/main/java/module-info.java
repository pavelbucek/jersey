module org.glassfish.jersey.examples.bookmark {

       requires public java.naming;
       requires public jta;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.media.media.json.jettison;
       requires public persistence.api;

       exports org.glassfish.jersey.examples.bookmark;
       exports org.glassfish.jersey.examples.bookmark.entity;
       exports org.glassfish.jersey.examples.bookmark.exception;
       exports org.glassfish.jersey.examples.bookmark.resource;
       exports org.glassfish.jersey.examples.bookmark.util.tx;

}
