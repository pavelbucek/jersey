module org.glassfish.jersey.media.media.jaxb {

        requires public java.xml.bind;

       requires public hk2.api;
       requires public hk2.locator;
       requires public javax.inject;
       requires public org.glassfish.jersey.core.common;
       requires public osgi.resource.locator;

       exports org.glassfish.jersey.jaxb.internal;
}

