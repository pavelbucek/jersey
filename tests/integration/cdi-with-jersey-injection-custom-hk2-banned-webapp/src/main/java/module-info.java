module org.glassfish.jersey.tests.integration.cdi.with.injection.custom.hk2.banned.webapp {

       requires public cdi.api;
       requires public javax.annotation.api;
       requires public javax.transaction.api;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
       requires public org.glassfish.jersey.ext.cdi.cdi1x.ban.custom.hk2.binding;
       requires public org.glassfish.jersey.ext.cdi.cdi1x.transaction;

       exports org.glassfish.jersey.tests.cdi.resources;
}

