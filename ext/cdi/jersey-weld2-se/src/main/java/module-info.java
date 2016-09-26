module org.glassfish.jersey.ext.cdi.weld2.se {

       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;
       requires transitive weld.api;
       requires transitive weld.se.core;

       exports org.glassfish.jersey.weld.se;

       provides org.glassfish.jersey.ext.cdi1x.internal.spi.Hk2LocatorManager with org.glassfish.jersey.weld.se.WeldHk2LocatorManager;
       provides org.glassfish.jersey.server.spi.ExternalRequestScope with org.glassfish.jersey.weld.se.WeldRequestScope;

}
