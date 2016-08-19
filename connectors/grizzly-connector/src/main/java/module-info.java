module org.glassfish.jersey.connectors.grizzly.connector {

       requires public connection.pool;
       requires public grizzly.framework;
       requires public grizzly.http.client;
       requires public grizzly.websockets;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.grizzly.connector;

}
