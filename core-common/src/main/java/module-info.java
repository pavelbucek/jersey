module org.glassfish.jersey.core.common {

       requires public hk2.api;
       requires public hk2.locator;
       requires public hk2.utils; //;
       requires public java.activation; //;
       requires public java.desktop; //;
       requires public java.logging; //;
       requires public javax.annotation.api;
       requires public javax.inject;
       requires public javax.ws.rs.api;
       // requires public jersey.guava;
       requires public org.osgi.core;
       requires public osgi.resource.locator;

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


        uses org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable;
        uses org.glassfish.jersey.spi.HeaderDelegateProvider;

       provides org.glassfish.jersey.internal.spi.AutoDiscoverable with org.glassfish.jersey.logging.LoggingFeatureAutoDiscoverable;

}
