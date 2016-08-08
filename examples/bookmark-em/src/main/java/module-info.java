module org.glassfish.jersey.examples.bookmark.em {

       requires public javax.annotation.api;
       requires public javax.ejb.api;
       requires public jta;
       requires public org.glassfish.jersey.media.media.json.jettison;
       requires public persistence.api;
        requires public java.naming;
        requires public org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.examples.bookmark_em;
       exports org.glassfish.jersey.examples.bookmark_em.entity;
       exports org.glassfish.jersey.examples.bookmark_em.exception;
       exports org.glassfish.jersey.examples.bookmark_em.resource;
       exports org.glassfish.jersey.examples.bookmark_em.util.tx;
}

