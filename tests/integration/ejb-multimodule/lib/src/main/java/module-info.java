module org.glassfish.jersey.tests.integration.ejb.multimodule.lib {

       requires transitive javax.annotation.api;
       requires transitive javax.ejb.api;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.multimodule.ejb.lib;

}
