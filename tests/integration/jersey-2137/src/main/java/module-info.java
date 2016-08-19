module org.glassfish.jersey.tests.integration.2137 {

       requires public cdi.api;
       requires public javax.annotation.api;
       requires public javax.transaction.api;
       requires public javax.ws.rs.api;
       requires public persistence.api;

       exports org.glassfish.jersey.tests.integration.jersey2137;

}
