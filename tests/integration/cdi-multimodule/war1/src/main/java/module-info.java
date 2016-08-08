module org.glassfish.jersey.tests.integration.cdi.multimodule.war1 {

       requires public cdi.api;
       requires public cdi.multimodule.lib;
       requires public javax.servlet.api;
       requires public javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.multimodule.cdi.web1;
}

