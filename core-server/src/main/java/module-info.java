module org.glassfish.jersey.core.server {

        requires public java.management;

       requires public asm.debug.all;
       requires public hk2.api;
       requires public hk2.locator;
       requires public javax.annotation.api;
       requires public javax.inject;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.media.media.jaxb;
       requires public org.osgi.core;
       requires public validation.api;

       exports com.sun.research.ws.wadl;
       exports org.glassfish.jersey.server;
       exports org.glassfish.jersey.server.filter;
       exports org.glassfish.jersey.server.filter.internal;
       exports org.glassfish.jersey.server.internal;
       exports org.glassfish.jersey.server.internal.inject;
       exports org.glassfish.jersey.server.internal.monitoring;
       exports org.glassfish.jersey.server.internal.monitoring.jmx;
       exports org.glassfish.jersey.server.internal.process;
       exports org.glassfish.jersey.server.internal.routing;
       exports org.glassfish.jersey.server.internal.scanning;
       exports org.glassfish.jersey.server.internal.sonar;
       exports org.glassfish.jersey.server.model;
       exports org.glassfish.jersey.server.model.internal;
       exports org.glassfish.jersey.server.monitoring;
       exports org.glassfish.jersey.server.spi;
       exports org.glassfish.jersey.server.spi.internal;
       exports org.glassfish.jersey.server.wadl;
       exports org.glassfish.jersey.server.wadl.config;
       exports org.glassfish.jersey.server.wadl.internal;
       exports org.glassfish.jersey.server.wadl.internal.generators;
       exports org.glassfish.jersey.server.wadl.internal.generators.resourcedoc;
       exports org.glassfish.jersey.server.wadl.internal.generators.resourcedoc.model;
       exports org.glassfish.jersey.server.wadl.internal.generators.resourcedoc.xhtml;
       exports org.glassfish.jersey.server.wadl.processor;
}

