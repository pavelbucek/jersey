module org.glassfish.jersey.core.client {

       requires public hk2.api;
       requires public hk2.locator;
       requires public javax.inject;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.client;
       exports org.glassfish.jersey.client.authentication;
       exports org.glassfish.jersey.client.filter;
       exports org.glassfish.jersey.client.internal;
       exports org.glassfish.jersey.client.spi;

        uses org.glassfish.jersey.client.spi.ConnectorProvider;
        uses org.glassfish.jersey.client.spi.DefaultSslContextProvider;
        uses org.glassfish.jersey.internal.spi.AutoDiscoverable;
}
