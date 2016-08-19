module org.glassfish.jersey.tests.integration.ejb.multimodule.war {

       requires public ejb.multimodule.lib;
       requires public javax.ejb.api;
       requires public javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.multimodule.ejb.web1;

}
