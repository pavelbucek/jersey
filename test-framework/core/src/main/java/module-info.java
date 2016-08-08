module org.glassfish.jersey.test.framework.test.framework.core {

       requires transitive javax.servlet.api;
       requires transitive junit;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive testng;

       exports org.glassfish.jersey.test;
       exports org.glassfish.jersey.test.spi;

        uses org.glassfish.jersey.test.spi.TestContainerFactory;
}
