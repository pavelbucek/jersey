module org.glassfish.jersey.tests.performance.testcases.json.jackson {

       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.media.media.json.jackson;

       exports org.glassfish.jersey.tests.performance.mbw.json;

}
