module org.glassfish.jersey.tests.integration.j.376 {

       requires public cdi.api;
       requires public grizzly.http.server;
       requires public javax.annotation.api;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
       requires public org.glassfish.jersey.ext.cdi.weld2.se;
       requires public org.glassfish.jersey.test.framework.providers.test.framework.provider.external;
       requires public validation.api;

       exports org.glassfish.jersey.tests.integration.j376;
}

