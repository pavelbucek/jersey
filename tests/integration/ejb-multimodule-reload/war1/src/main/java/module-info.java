module org.glassfish.jersey.tests.integration.ejb.multimodule.reload.war1 {

       requires transitive ejb.multimodule.reload.lib;
       requires transitive javax.ejb.api;
       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.tests.integration.multimodule.ejb.reload.web1;

}
