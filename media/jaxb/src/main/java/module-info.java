module org.glassfish.jersey.media.media.jaxb {

       requires public hk2.api;
       requires public hk2.locator;
       requires public java.xml.bind;
       requires public javax.inject;
       requires public org.glassfish.jersey.core.common;
       requires public osgi.resource.locator;

       exports org.glassfish.jersey.jaxb.internal;

       provides org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable with org.glassfish.jersey.jaxb.internal.JaxbAutoDiscoverable;

}
