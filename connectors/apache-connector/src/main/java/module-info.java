module org.glassfish.jersey.connectors.apache.connector {

       requires transitive httpclient;
       requires transitive httpcore;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.apache.connector;

}
