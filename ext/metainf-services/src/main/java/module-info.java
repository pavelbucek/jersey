module org.glassfish.jersey.ext.metainf.services {

       requires public org.glassfish.jersey.core.common;

       exports org.glassfish.jersey.spidiscovery.internal;

        uses javax.ws.rs.ext.MessageBodyReader;
        uses javax.ws.rs.ext.MessageBodyWriter;
        uses javax.ws.rs.ext.ExceptionMapper;

       provides org.glassfish.jersey.internal.spi.ForcedAutoDiscoverable with org.glassfish.jersey.spidiscovery.internal.MetaInfServicesAutoDiscoverable;

}
