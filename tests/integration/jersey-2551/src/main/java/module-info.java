module org.glassfish.jersey.tests.integration.2551 {

       requires public org.glassfish.jersey.containers.container.servlet.core;

       exports org.glassfish.jersey.tests.integration.jersey2551;

       provides org.glassfish.hk2.extension.ServiceLocatorGenerator with org.glassfish.jersey.tests.integration.jersey2551.ServiceLocatorGenerator;

}
