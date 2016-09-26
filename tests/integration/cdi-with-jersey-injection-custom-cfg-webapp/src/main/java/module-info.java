module org.glassfish.jersey.tests.integration.cdi.with.injection.custom.cfg.webapp {

       requires transitive cdi.api;
       requires transitive javax.annotation.api;
       requires transitive javax.transaction.api;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x.transaction;

       exports org.glassfish.jersey.tests.cdi.resources;

       provides org.glassfish.jersey.ext.cdi1x.spi.Hk2CustomBoundTypesProvider with org.glassfish.jersey.tests.cdi.resources.MyHk2TypesProvider;

}
