module org.glassfish.jersey.connectors.jetty.connector {

       requires public javax.ws.rs.api;
       requires public jetty.client;
       requires public jetty.http;
       requires public jetty.util;
       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.jetty.connector;

}
