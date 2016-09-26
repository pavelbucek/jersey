module org.glassfish.jersey.connectors.jetty.connector {

       requires transitive javax.ws.rs.api;
       requires transitive jetty.client;
       requires transitive jetty.http;
       requires transitive jetty.util;
       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.jetty.connector;

}
