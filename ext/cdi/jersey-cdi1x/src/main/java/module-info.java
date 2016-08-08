module org.glassfish.jersey.ext.cdi.cdi1x {

       requires transitive cdi.api;
       requires transitive java.naming;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.ext.cdi1x.internal;
       exports org.glassfish.jersey.ext.cdi1x.internal.spi;
       exports org.glassfish.jersey.ext.cdi1x.spi;

       provides javax.enterprise.inject.spi.Extension with org.glassfish.jersey.ext.cdi1x.internal.CdiComponentProvider;
       provides org.glassfish.jersey.server.spi.ComponentProvider with org.glassfish.jersey.ext.cdi1x.internal.CdiComponentProvider;

}
