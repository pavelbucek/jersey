module org.glassfish.jersey.tests.integration.cdi.multimodule.lib {

       requires transitive cdi.api;
       requires transitive javax.annotation.api;
       requires transitive javax.ejb.api;
       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.multimodule.cdi.lib;

}
