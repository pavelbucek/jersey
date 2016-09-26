module org.glassfish.jersey.examples.bookmark.em {

       requires transitive java.naming;
       requires transitive javax.annotation.api;
       requires transitive javax.ejb.api;
       requires transitive jta;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.media.media.json.jettison;
       requires transitive persistence.api;

       exports org.glassfish.jersey.examples.bookmark_em;
       exports org.glassfish.jersey.examples.bookmark_em.entity;
       exports org.glassfish.jersey.examples.bookmark_em.exception;
       exports org.glassfish.jersey.examples.bookmark_em.resource;
       exports org.glassfish.jersey.examples.bookmark_em.util.tx;

}
