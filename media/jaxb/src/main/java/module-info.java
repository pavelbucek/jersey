module org.glassfish.jersey.media.media.jaxb {

       requires transitive hk2.api;
       requires transitive hk2.locator;
       requires transitive java.xml.bind;
       requires transitive javax.inject;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive osgi.resource.locator;

       exports private org.glassfish.jersey.jaxb.internal; // hk2

       provides org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable with org.glassfish.jersey.jaxb.internal.JaxbAutoDiscoverable;

}
