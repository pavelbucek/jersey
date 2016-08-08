module org.glassfish.jersey.tests.integration.ejb.multimodule.reload.war1 {

       requires public ejb.multimodule.reload.lib;
       requires public javax.ejb.api;
       requires public javax.inject;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.tests.integration.multimodule.ejb.reload.web1;
}

