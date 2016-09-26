module org.glassfish.jersey.incubator.gae.integration {

       requires transitive appengine.api;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.server.gae;

}
