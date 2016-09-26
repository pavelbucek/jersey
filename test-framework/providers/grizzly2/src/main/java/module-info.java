module org.glassfish.jersey.test.framework.providers.test.framework.provider.grizzly2 {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.servlet;
       requires transitive org.glassfish.jersey.test.framework.test.framework.core;

       exports org.glassfish.jersey.test.grizzly;

       provides org.glassfish.jersey.test.spi.TestContainerFactory with org.glassfish.jersey.test.grizzly.GrizzlyTestContainerFactory;
       provides org.glassfish.jersey.test.spi.TestContainerFactory with org.glassfish.jersey.test.grizzly.GrizzlyWebTestContainerFactory;

}
