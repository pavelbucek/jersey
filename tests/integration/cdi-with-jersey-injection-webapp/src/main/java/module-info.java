module org.glassfish.jersey.tests.integration.cdi.with.injection.webapp {

       requires public cdi.api;
       requires public javax.annotation.api;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
       requires public org.glassfish.jersey.ext.cdi.cdi1x.transaction;

       exports org.glassfish.jersey.tests.cdi.resources;

       provides org.glassfish.jersey.ext.cdi1x.spi.Hk2CustomBoundTypesProvider with org.glassfish.jersey.tests.cdi.resources.MyHk2TypesProvider;

}
