module org.glassfish.jersey.tests.integration.cdi.test.webapp {

       requires public cdi.api;
       requires public javax.annotation.api;
       requires public javax.ws.rs.api;
         requires public java.logging;
         requires public javax.inject;

       exports org.glassfish.jersey.tests.cdi.resources;
}

