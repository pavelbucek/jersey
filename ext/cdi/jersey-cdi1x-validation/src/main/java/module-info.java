module org.glassfish.jersey.ext.cdi.cdi1x.validation {

       requires public cdi.api;
       requires public hibernate.validator.cdi;
       requires public javax.interceptor.api;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.ext.cdi1x.validation.internal;

       provides javax.enterprise.inject.spi.Extension with org.glassfish.jersey.ext.cdi1x.validation.internal.CdiInterceptorWrapperExtension;

}
