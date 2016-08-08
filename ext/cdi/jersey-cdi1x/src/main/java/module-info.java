module org.glassfish.jersey.ext.cdi.cdi1x {

        requires public java.naming;

       requires public cdi.api;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.ext.cdi1x.internal;
       exports org.glassfish.jersey.ext.cdi1x.internal.spi;
       exports org.glassfish.jersey.ext.cdi1x.spi;
}

