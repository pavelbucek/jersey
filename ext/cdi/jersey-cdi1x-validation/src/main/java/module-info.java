module org.glassfish.jersey.ext.cdi.cdi1x.validation {

       requires transitive cdi.api;
       requires transitive hibernate.validator.cdi;
       requires transitive javax.interceptor.api;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.ext.cdi1x.validation.internal;

       provides javax.enterprise.inject.spi.Extension with org.glassfish.jersey.ext.cdi1x.validation.internal.CdiInterceptorWrapperExtension;

}
