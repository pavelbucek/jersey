module org.glassfish.jersey.examples.https.clientserver.grizzly {

       requires transitive javax.annotation.api;
       requires transitive org.glassfish.jersey.connectors.grizzly.connector;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.core.client;

       exports org.glassfish.jersey.examples.httpsclientservergrizzly;

}
