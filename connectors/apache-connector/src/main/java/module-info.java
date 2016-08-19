module org.glassfish.jersey.connectors.apache.connector {

       requires public httpclient;
       requires public httpcore;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.apache.connector;

}
