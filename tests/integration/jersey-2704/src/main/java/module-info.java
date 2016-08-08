module org.glassfish.jersey.tests.integration.2704 {

       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.test.framework.providers.test.framework.provider.external;

       exports org.glassfish.jersey.tests.integration.jersey2704;
       exports org.glassfish.jersey.tests.integration.jersey2704.services;

}
