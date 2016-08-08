module org.glassfish.jersey.examples.bookmark {

       requires public jta;
       requires public org.glassfish.jersey.media.media.json.jettison;
       requires public persistence.api;
        requires public java.naming;
        requires public org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.examples.bookmark;
       exports org.glassfish.jersey.examples.bookmark.entity;
       exports org.glassfish.jersey.examples.bookmark.exception;
       exports org.glassfish.jersey.examples.bookmark.resource;
       exports org.glassfish.jersey.examples.bookmark.util.tx;
}

