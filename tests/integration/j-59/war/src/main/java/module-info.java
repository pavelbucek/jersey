module org.glassfish.jersey.tests.integration.j.59.cdi.war {

       requires transitive cdi.api;
       requires transitive j.59.ejb.lib;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.j59.cdi.web;

}
