module org.glassfish.jersey.media.media.json.jackson1 {

       requires transitive jackson.core.asl;
       requires transitive jackson.jaxrs;
       requires transitive jackson.mapper.asl;
       requires transitive jackson.xc;
       requires transitive org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.jackson1;

}
