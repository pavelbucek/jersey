module org.glassfish.jersey.tests.integration.servlet.3.init.provider {

       requires public javax.servlet.api;
       requires public org.glassfish.jersey.containers.container.servlet;
       requires public org.glassfish.jersey.ext.servlet.portability;

       exports org.glassfish.jersey.tests.integration.servlet_3_init_provider;

       provides org.glassfish.jersey.servlet.internal.spi.ServletContainerProvider with org.glassfish.jersey.tests.integration.servlet_3_init_provider.TestServletContainerProvider;

}
