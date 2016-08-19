module org.glassfish.jersey.media.media.json.jackson1 {

       requires public jackson.core.asl;
       requires public jackson.jaxrs;
       requires public jackson.mapper.asl;
       requires public jackson.xc;
       requires public org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.jackson1;

}
