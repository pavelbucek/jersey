module org.glassfish.jersey.examples.osgi-http-service.bundle {

       requires public org.apache.felix.eventadmin;
       requires public org.apache.felix.http.bundle;
       requires public org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.examples.osgihttpservice;

}
