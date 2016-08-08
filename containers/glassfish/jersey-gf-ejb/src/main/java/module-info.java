module org.glassfish.jersey.containers.glassfish.gf.ejb {

       requires transitive config.api;
       requires transitive container.common;
       requires transitive deployment.common;
       requires transitive dol;
       requires transitive ejb.container;
       requires transitive hk2.config;
       requires transitive internal.api;
       requires transitive javax.ejb.api;
       requires transitive javax.inject;
       requires transitive javax.interceptor.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;

       exports org.glassfish.jersey.gf.ejb.internal;

       provides org.glassfish.jersey.server.spi.ComponentProvider with org.glassfish.jersey.gf.ejb.internal.EjbComponentProvider;

}
