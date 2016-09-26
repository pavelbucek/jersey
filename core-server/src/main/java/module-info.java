module org.glassfish.jersey.core.server {

       requires transitive asm.debug.all;
       requires transitive hk2.api;
       requires transitive hk2.locator;
       requires transitive java.management;
       requires transitive javax.annotation.api;
       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.media.media.jaxb;
       requires transitive org.osgi.core;
       requires transitive validation.api;

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

        exports private org.glassfish.jersey.server.internal.inject to hk2.utils, hk2.locator;
        exports private org.glassfish.jersey.server.internal to hk2.utils, hk2.locator;
        exports private org.glassfish.jersey.server.internal.process to hk2.locator;
        exports private org.glassfish.jersey.server.model.internal to hk2.utils, hk2.locator;
        exports private org.glassfish.jersey.server.model to hk2.utils, hk2.locator;
        exports private org.glassfish.jersey.server to hk2.utils, hk2.locator;
        exports private org.glassfish.jersey.server.wadl.processor to hk2.utils, hk2.locator;

        uses org.glassfish.jersey.server.spi.ComponentProvider;
        uses org.glassfish.jersey.server.spi.ContainerProvider;
        uses org.glassfish.jersey.internal.spi.AutoDiscoverable;

       provides javax.ws.rs.ext.RuntimeDelegate with org.glassfish.jersey.server.internal.RuntimeDelegateImpl;
       provides org.glassfish.jersey.internal.spi.AutoDiscoverable with org.glassfish.jersey.server.filter.internal.ServerFiltersAutoDiscoverable;
       provides org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable with org.glassfish.jersey.server.internal.monitoring.MonitoringAutodiscoverable;
       provides org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable with org.glassfish.jersey.server.wadl.internal.WadlAutoDiscoverable;

}
