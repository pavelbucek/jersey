module org.glassfish.jersey.ext.cdi.cdi1x.servlet {

       requires public cdi.api;
       requires public javax.servlet.api;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;

       exports org.glassfish.jersey.ext.cdi1x.servlet.internal;
}

