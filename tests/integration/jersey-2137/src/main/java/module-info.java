module org.glassfish.jersey.tests.integration.2137 {

       requires transitive cdi.api;
       requires transitive javax.annotation.api;
       requires transitive javax.transaction.api;
       requires transitive javax.ws.rs.api;
       requires transitive persistence.api;

       exports org.glassfish.jersey.tests.integration.jersey2137;

}
