module org.glassfish.jersey.tests.integration.cdi.multipart.webapp {

       requires transitive cdi.api;
       requires transitive javax.annotation.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.media.media.multipart;

       exports org.glassfish.jersey.tests.cdi.resources;

}
