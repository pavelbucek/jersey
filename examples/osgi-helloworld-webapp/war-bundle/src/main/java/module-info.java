module org.glassfish.jersey.examples.osgi-helloworld-webapp.war.bundle {

       requires transitive javax.servlet.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.apache.felix.eventadmin;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.examples.osgi-helloworld-webapp.additional.bundle;
       requires transitive org.glassfish.jersey.examples.osgi-helloworld-webapp.alternate.version.bundle;
       requires transitive org.glassfish.jersey.examples.osgi-helloworld-webapp.lib.bundle;

       exports org.glassfish.jersey.examples.osgi.helloworld;
       exports org.glassfish.jersey.examples.osgi.helloworld.resource;
       exports org.glassfish.jersey.examples.osgi.helloworld.resource.subpackage;

}
