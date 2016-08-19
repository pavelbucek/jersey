module org.glassfish.jersey.tests.integration.default.ssl.context.provider {

       requires public javax.annotation.api;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.client;

       exports org.glassfish.jersey.tests.integration.client.connector.provider;

       provides org.glassfish.jersey.client.spi.ConnectorProvider with org.glassfish.jersey.tests.integration.client.connector.provider.CustomConnectorProvider;

}
