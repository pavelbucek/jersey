module org.glassfish.jersey.test.framework.providers.test.framework.provider.inmemory {

       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.test.framework.test.framework.core;

       exports org.glassfish.jersey.test.inmemory;

       provides org.glassfish.jersey.test.spi.TestContainerFactory with org.glassfish.jersey.test.inmemory.InMemoryTestContainerFactory;

}
