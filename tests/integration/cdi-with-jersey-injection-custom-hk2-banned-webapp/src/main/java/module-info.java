module org.glassfish.jersey.tests.integration.cdi.with.injection.custom.hk2.banned.webapp {

       requires transitive cdi.api;
       requires transitive javax.annotation.api;
       requires transitive javax.transaction.api;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x.ban.custom.hk2.binding;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x.transaction;

       exports org.glassfish.jersey.tests.cdi.resources;

}
