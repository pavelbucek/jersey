module org.glassfish.jersey.core.client {

       requires transitive hk2.api;
       requires transitive hk2.locator;
       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.client;
       exports org.glassfish.jersey.client.authentication;
       exports org.glassfish.jersey.client.filter;
       exports org.glassfish.jersey.client.internal;
       exports org.glassfish.jersey.client.spi;

        opens org.glassfish.jersey.client to hk2.locator, hk2.utils;

        uses org.glassfish.jersey.client.spi.ConnectorProvider;
        uses org.glassfish.jersey.client.spi.DefaultSslContextProvider;
        uses org.glassfish.jersey.internal.spi.AutoDiscoverable;
}
