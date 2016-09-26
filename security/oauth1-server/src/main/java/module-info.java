module org.glassfish.jersey.security.oauth1.server {

       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.security.oauth1.signature;

       exports org.glassfish.jersey.server.oauth1;
       exports org.glassfish.jersey.server.oauth1.internal;

}
