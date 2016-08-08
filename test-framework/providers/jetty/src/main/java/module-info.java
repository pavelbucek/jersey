module org.glassfish.jersey.test.framework.providers.test.framework.provider.jetty {

       requires transitive org.glassfish.jersey.containers.container.jetty.http;
       requires transitive org.glassfish.jersey.test.framework.test.framework.core;

       exports org.glassfish.jersey.test.jetty;

       provides org.glassfish.jersey.test.spi.TestContainerFactory with org.glassfish.jersey.test.jetty.JettyTestContainerFactory;

}
