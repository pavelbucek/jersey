module org.glassfish.jersey.tests.integration.cdi.ejb.test.webapp {

       requires public cdi.api;
       requires public javax.annotation.api;
       requires public javax.ejb.api;
       requires public javax.inject;
       requires public javax.ws.rs.api;

       exports org.glassfish.jersey.tests.cdi.resources;

}
