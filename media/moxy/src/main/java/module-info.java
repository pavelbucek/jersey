module org.glassfish.jersey.media.media.moxy {

       requires transitive java.xml;
       requires transitive org.eclipse.persistence.core;
       requires transitive org.eclipse.persistence.moxy;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.ext.entity.filtering;

       exports org.glassfish.jersey.moxy.internal;
       exports org.glassfish.jersey.moxy.json;
       exports org.glassfish.jersey.moxy.json.internal;
       exports org.glassfish.jersey.moxy.xml;

       provides org.glassfish.jersey.internal.spi.AutoDiscoverable with org.glassfish.jersey.moxy.json.internal.MoxyJsonAutoDiscoverable;

}
