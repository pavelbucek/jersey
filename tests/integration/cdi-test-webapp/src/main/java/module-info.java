module org.glassfish.jersey.tests.integration.cdi.test.webapp {

       requires public cdi.api;
       requires public java.logging;
       requires public javax.annotation.api;
       requires public javax.inject;
       requires public javax.ws.rs.api;

       exports org.glassfish.jersey.tests.cdi.resources;

       provides javax.enterprise.inject.spi.Extension with org.glassfish.jersey.tests.cdi.resources.CustomExtension;

}
