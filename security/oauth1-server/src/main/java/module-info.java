module org.glassfish.jersey.security.oauth1.server {

       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.security.oauth1.signature;

       exports org.glassfish.jersey.server.oauth1;
       exports org.glassfish.jersey.server.oauth1.internal;
}

