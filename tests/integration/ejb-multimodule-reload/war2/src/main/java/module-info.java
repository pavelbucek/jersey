module org.glassfish.jersey.tests.integration.ejb.multimodule.reload.war2 {

       requires public ejb.multimodule.reload.lib;
       requires public javax.ejb.api;
       requires public javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.multimodule.ejb.reload.web2;
}

