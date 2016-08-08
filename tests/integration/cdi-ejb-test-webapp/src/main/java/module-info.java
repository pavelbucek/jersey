module org.glassfish.jersey.tests.integration.cdi.ejb.test.webapp {

       requires transitive cdi.api;
       requires transitive javax.annotation.api;
       requires transitive javax.ejb.api;
       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.cdi.resources;

}
