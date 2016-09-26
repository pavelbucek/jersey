module org.glassfish.jersey.examples.sse.item.store.webapp {

       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.media.media.sse;

       exports org.glassfish.jersey.examples.sseitemstore;

}
