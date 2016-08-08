module org.glassfish.jersey.connectors.grizzly.connector {

       requires transitive connection.pool;
       requires transitive grizzly.framework;
       requires transitive grizzly.http.client;
       requires transitive grizzly.websockets;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.grizzly.connector;

}
