module org.glassfish.jersey.tests.integration.ejb.test.webapp {

       requires public javax.annotation.api;
       requires public javax.ejb.api;
       requires public javax.servlet.api;
       requires public javax.ws.rs.api;
        requires public java.logging;

       exports org.glassfish.jersey.tests.ejb.resources;
}

