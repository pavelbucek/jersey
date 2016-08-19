module org.glassfish.jersey.examples.osgi-helloworld-webapp.war.bundle {

       requires public javax.servlet.api;
       requires public javax.ws.rs.api;
       requires public org.apache.felix.eventadmin;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.examples.osgi-helloworld-webapp.additional.bundle;
       requires public org.glassfish.jersey.examples.osgi-helloworld-webapp.alternate.version.bundle;
       requires public org.glassfish.jersey.examples.osgi-helloworld-webapp.lib.bundle;

       exports org.glassfish.jersey.examples.osgi.helloworld;
       exports org.glassfish.jersey.examples.osgi.helloworld.resource;
       exports org.glassfish.jersey.examples.osgi.helloworld.resource.subpackage;

}
