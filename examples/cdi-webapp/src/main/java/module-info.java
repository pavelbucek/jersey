module org.glassfish.jersey.examples.cdi.webapp {

       requires public cdi.api;
       requires public javax.annotation.api;
       requires public javax.interceptor.api;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
       requires public org.glassfish.jersey.ext.cdi.weld2.se;

       exports org.glassfish.jersey.examples.cdi;
       exports org.glassfish.jersey.examples.cdi.resources;

}
