module org.glassfish.jersey.tests.integration.ejb.multimodule.war {

       requires transitive ejb.multimodule.lib;
       requires transitive javax.ejb.api;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.multimodule.ejb.web1;

}
