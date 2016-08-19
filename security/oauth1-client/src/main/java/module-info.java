module org.glassfish.jersey.security.oauth1.client {

       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.security.oauth1.signature;

       exports org.glassfish.jersey.client.oauth1;

}
