module org.glassfish.jersey.tests.integration.client.connector.provider {

       requires transitive javax.annotation.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.client;

       exports org.glassfish.jersey.tests.integration.client.connector.provider;

       provides org.glassfish.jersey.client.spi.ConnectorProvider with org.glassfish.jersey.tests.integration.client.connector.provider.CustomConnectorProvider;
       provides org.glassfish.jersey.client.spi.DefaultSslContextProvider with org.glassfish.jersey.tests.integration.client.connector.provider.CustomDefaultSslContextProvider;

}
