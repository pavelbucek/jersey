module org.glassfish.jersey.examples.osgi-http-service.bundle {

       requires transitive org.apache.felix.eventadmin;
       requires transitive org.apache.felix.http.bundle;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.examples.osgihttpservice;

}
