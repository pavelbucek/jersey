module org.glassfish.jersey.tests.integration.ejb.multimodule.reload.war2 {

       requires transitive ejb.multimodule.reload.lib;
       requires transitive javax.ejb.api;
       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.multimodule.ejb.reload.web2;

}
