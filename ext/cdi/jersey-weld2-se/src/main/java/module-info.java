module org.glassfish.jersey.ext.cdi.weld2.se {

       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
       requires public weld.se.core;
        requires public weld.api;

       exports org.glassfish.jersey.weld.se;
}

