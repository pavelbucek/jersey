module org.glassfish.jersey.examples.https.clientserver.grizzly {

       requires public javax.annotation.api;
       requires public org.glassfish.jersey.connectors.grizzly.connector;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.core.client;

       exports org.glassfish.jersey.examples.httpsclientservergrizzly;

}
