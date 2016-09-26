module org.glassfish.jersey.examples.cdi.webapp {

       requires transitive cdi.api;
       requires transitive javax.annotation.api;
       requires transitive javax.interceptor.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;
       requires transitive org.glassfish.jersey.ext.cdi.weld2.se;

       exports org.glassfish.jersey.examples.cdi;
       exports org.glassfish.jersey.examples.cdi.resources;

}
