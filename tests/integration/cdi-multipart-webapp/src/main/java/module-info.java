module org.glassfish.jersey.tests.integration.cdi.multipart.webapp {

       requires public cdi.api;
       requires public javax.annotation.api;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.media.media.multipart;

       exports org.glassfish.jersey.tests.cdi.resources;
}

