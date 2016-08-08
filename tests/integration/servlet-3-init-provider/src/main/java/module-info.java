module org.glassfish.jersey.tests.integration.servlet.3.init.provider {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.ext.servlet.portability;

       exports org.glassfish.jersey.tests.integration.servlet_3_init_provider;

       provides org.glassfish.jersey.servlet.internal.spi.ServletContainerProvider with org.glassfish.jersey.tests.integration.servlet_3_init_provider.TestServletContainerProvider;

}
