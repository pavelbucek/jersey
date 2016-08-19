module org.glassfish.jersey.tests.integration.cdi.multimodule.war2 {

       requires public cdi.api;
       requires public cdi.multimodule.lib;
       requires public javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.multimodule.cdi.web2;

}
