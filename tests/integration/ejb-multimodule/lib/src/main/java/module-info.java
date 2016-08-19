module org.glassfish.jersey.tests.integration.ejb.multimodule.lib {

       requires public javax.annotation.api;
       requires public javax.ejb.api;
       requires public javax.ws.rs.api;

       exports org.glassfish.jersey.tests.integration.multimodule.ejb.lib;

}
