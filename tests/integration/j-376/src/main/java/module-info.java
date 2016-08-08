module org.glassfish.jersey.tests.integration.j.376 {

       requires transitive cdi.api;
       requires transitive grizzly.http.server;
       requires transitive javax.annotation.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;
       requires transitive org.glassfish.jersey.ext.cdi.weld2.se;
       requires transitive org.glassfish.jersey.test.framework.providers.test.framework.provider.external;
       requires transitive validation.api;

       exports org.glassfish.jersey.tests.integration.j376;

}
