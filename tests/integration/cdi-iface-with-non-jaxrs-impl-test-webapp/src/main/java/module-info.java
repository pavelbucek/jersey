module org.glassfish.jersey.tests.integration.cdi.iface.with.non.jaxrs.impl.test.webapp {

       requires public cdi.api;
       requires public javax.ws.rs.api;
        requires public javax.inject;

       exports org.glassfish.jersey.tests.cdi.resources;
}

