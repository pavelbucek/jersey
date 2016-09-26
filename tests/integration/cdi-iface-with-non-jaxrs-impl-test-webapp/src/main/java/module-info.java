module org.glassfish.jersey.tests.integration.cdi.iface.with.non.jaxrs.impl.test.webapp {

       requires transitive cdi.api;
       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.cdi.resources;

}
