module org.glassfish.jersey.test.framework.providers.test.framework.provider.simple {

       requires public org.glassfish.jersey.containers.container.simple.http;
       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.test.framework.test.framework.core;

       exports org.glassfish.jersey.test.simple;

       provides org.glassfish.jersey.test.spi.TestContainerFactory with org.glassfish.jersey.test.simple.SimpleTestContainerFactory;

}
