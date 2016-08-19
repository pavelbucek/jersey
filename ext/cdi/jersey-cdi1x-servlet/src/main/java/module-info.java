module org.glassfish.jersey.ext.cdi.cdi1x.servlet {

       requires public cdi.api;
       requires public javax.servlet.api;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;

       exports org.glassfish.jersey.ext.cdi1x.servlet.internal;

       provides javax.enterprise.inject.spi.Extension with org.glassfish.jersey.ext.cdi1x.servlet.internal.CdiExternalRequestScopeExtension;
       provides org.glassfish.jersey.ext.cdi1x.internal.spi.Hk2LocatorManager with org.glassfish.jersey.ext.cdi1x.servlet.internal.ServletHk2LocatorManager;
       provides org.glassfish.jersey.server.spi.ExternalRequestScope with org.glassfish.jersey.ext.cdi1x.servlet.internal.CdiExternalRequestScope;

}
