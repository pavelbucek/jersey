module org.glassfish.jersey.ext.cdi.cdi1x {

       requires public cdi.api;
       requires public java.naming;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.ext.cdi1x.internal;
       exports org.glassfish.jersey.ext.cdi1x.internal.spi;
       exports org.glassfish.jersey.ext.cdi1x.spi;

       provides javax.enterprise.inject.spi.Extension with org.glassfish.jersey.ext.cdi1x.internal.CdiComponentProvider;
       provides org.glassfish.jersey.server.spi.ComponentProvider with org.glassfish.jersey.ext.cdi1x.internal.CdiComponentProvider;

}
