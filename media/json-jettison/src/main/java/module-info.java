module org.glassfish.jersey.media.media.json.jettison {

       requires public jettison;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.media.media.jaxb;

       exports org.glassfish.jersey.jettison;
       exports org.glassfish.jersey.jettison.internal;
       exports org.glassfish.jersey.jettison.internal.entity;
}

