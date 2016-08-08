module org.glassfish.jersey.containers.glassfish.gf.ejb {

        requires public javax.ws.rs.api;
        requires public org.glassfish.jersey.core.common;

       requires public container.common;
       requires public ejb.container;
       requires public javax.ejb.api;
       requires public javax.inject;
       requires public javax.interceptor.api;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
        requires public config.api;
        requires public internal.api;
        requires public dol;
        requires public hk2.config;
        requires public deployment.common;


       exports org.glassfish.jersey.gf.ejb.internal;
}

