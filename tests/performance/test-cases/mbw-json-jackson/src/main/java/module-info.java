module org.glassfish.jersey.tests.performance.testcases.json.jackson {

       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.media.media.json.jackson;

       exports org.glassfish.jersey.tests.performance.mbw.json;

}
