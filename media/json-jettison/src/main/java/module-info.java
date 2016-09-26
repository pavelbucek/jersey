module org.glassfish.jersey.media.media.json.jettison {

       requires transitive jettison;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.media.media.jaxb;

       exports org.glassfish.jersey.jettison;
       exports org.glassfish.jersey.jettison.internal;
       exports org.glassfish.jersey.jettison.internal.entity;

}
