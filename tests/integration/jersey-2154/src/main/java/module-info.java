module org.glassfish.jersey.tests.integration.2154 {

       requires transitive cdi.api;
       requires transitive javax.annotation.api;
       requires transitive javax.ejb.api;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.jersey2154;

}
