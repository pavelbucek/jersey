module org.glassfish.jersey.tests.integration.cdi.multimodule.war2 {

       requires transitive cdi.api;
       requires transitive cdi.multimodule.lib;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.multimodule.cdi.web2;

}
