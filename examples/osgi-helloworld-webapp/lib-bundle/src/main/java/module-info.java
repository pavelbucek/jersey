module org.glassfish.jersey.examples.osgi-helloworld-webapp.lib.bundle {

       requires transitive javax.ws.rs.api;

       exports org.glassfish.jersey.examples.osgi.helloworld.resource;

}
