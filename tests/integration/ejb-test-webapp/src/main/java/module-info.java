module org.glassfish.jersey.tests.integration.ejb.test.webapp {

       requires transitive java.logging;
       requires transitive javax.annotation.api;
       requires transitive javax.ejb.api;
       requires transitive javax.servlet.api;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.ejb.resources;

}
