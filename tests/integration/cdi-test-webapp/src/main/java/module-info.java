module org.glassfish.jersey.tests.integration.cdi.test.webapp {

       requires transitive cdi.api;
       requires transitive java.logging;
       requires transitive javax.annotation.api;
       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.cdi.resources;

       provides javax.enterprise.inject.spi.Extension with org.glassfish.jersey.tests.cdi.resources.CustomExtension;

}
