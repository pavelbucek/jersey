module org.glassfish.jersey.containers.glassfish.gf.ejb {

       requires public config.api;
       requires public container.common;
       requires public deployment.common;
       requires public dol;
       requires public ejb.container;
       requires public hk2.config;
       requires public internal.api;
       requires public javax.ejb.api;
       requires public javax.inject;
       requires public javax.interceptor.api;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;

       exports org.glassfish.jersey.gf.ejb.internal;

       provides org.glassfish.jersey.server.spi.ComponentProvider with org.glassfish.jersey.gf.ejb.internal.EjbComponentProvider;

}
