module org.glassfish.jersey.security.oauth1.client {

       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.security.oauth1.signature;

       exports org.glassfish.jersey.client.oauth1;

}
