module org.glassfish.jersey.tests.integration.j.59.cdi.war {

       requires public cdi.api;
       requires public j.59.ejb.lib;
       requires public javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.j59.cdi.web;
}

