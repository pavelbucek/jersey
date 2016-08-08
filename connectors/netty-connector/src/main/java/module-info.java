module org.glassfish.jersey.connectors.netty.connector {

       requires transitive javax.ws.rs.api;
       requires transitive netty.all;
       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.netty.connector;
       exports org.glassfish.jersey.netty.connector.internal;

}
