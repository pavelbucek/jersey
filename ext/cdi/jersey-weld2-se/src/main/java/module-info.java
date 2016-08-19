module org.glassfish.jersey.ext.cdi.weld2.se {

       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
       requires public weld.api;
       requires public weld.se.core;

       exports org.glassfish.jersey.weld.se;

       provides org.glassfish.jersey.ext.cdi1x.internal.spi.Hk2LocatorManager with org.glassfish.jersey.weld.se.WeldHk2LocatorManager;
       provides org.glassfish.jersey.server.spi.ExternalRequestScope with org.glassfish.jersey.weld.se.WeldRequestScope;

}
