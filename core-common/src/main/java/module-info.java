module org.glassfish.jersey.core.common {

       requires transitive hk2.api;
       requires transitive hk2.locator;
       requires transitive hk2.utils; //;
       requires transitive java.activation; //;
       requires transitive java.desktop; //;
       requires transitive java.logging; //;
       requires transitive javax.annotation.api;
       requires transitive javax.inject;
       requires transitive javax.ws.rs.api;
       requires transitive org.osgi.core;
       requires static osgi.resource.locator;

       exports org.glassfish.jersey;
       exports org.glassfish.jersey.internal;
       exports org.glassfish.jersey.internal.guava;
       exports org.glassfish.jersey.internal.inject;
       exports org.glassfish.jersey.internal.l10n;
       exports org.glassfish.jersey.internal.sonar;
       exports org.glassfish.jersey.internal.spi;
       exports org.glassfish.jersey.internal.util;
       exports org.glassfish.jersey.internal.util.collection;
       exports org.glassfish.jersey.logging;
       exports org.glassfish.jersey.message;
       exports org.glassfish.jersey.message.internal;
       exports org.glassfish.jersey.model;
       exports org.glassfish.jersey.model.internal;
       exports org.glassfish.jersey.process;
       exports org.glassfish.jersey.process.internal;
       exports org.glassfish.jersey.spi;
       exports org.glassfish.jersey.uri;
       exports org.glassfish.jersey.uri.internal;
//       exports org.glassfish.jersey.uri.internal to
//        org.glassfish.jersey.core.server, org.glassfish.jersey.core.client;

        opens org.glassfish.jersey.internal.inject to hk2.utils, hk2.locator;
        opens org.glassfish.jersey.model.internal to hk2.utils, hk2.locator;
        opens org.glassfish.jersey.message.internal to hk2.locator;
        opens org.glassfish.jersey.internal to hk2.utils, hk2.locator;

        uses org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable;
        uses org.glassfish.jersey.spi.HeaderDelegateProvider;

       provides org.glassfish.jersey.internal.spi.AutoDiscoverable with org.glassfish.jersey.logging.LoggingFeatureAutoDiscoverable;

}
