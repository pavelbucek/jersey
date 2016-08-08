module org.glassfish.jersey.examples.osgi-helloworld-webapp.additional.bundle {

       requires public javax.ws.rs.api;

       exports org.glassfish.jersey.examples.osgi.helloworld.additional.resource;
       exports org.glassfish.jersey.examples.osgi.helloworld.additional.resource.subpackage;
}

