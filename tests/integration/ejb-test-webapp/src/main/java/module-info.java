module org.glassfish.jersey.tests.integration.ejb.test.webapp {

       requires public java.logging;
       requires public javax.annotation.api;
       requires public javax.ejb.api;
       requires public javax.servlet.api;
       requires public javax.ws.rs.api;

       exports org.glassfish.jersey.tests.ejb.resources;

}
