module org.glassfish.jersey.ext.cdi.cdi1x.validation {

       requires public cdi.api;
       requires public hibernate.validator.cdi;
       requires public org.glassfish.jersey.core.server;
        requires public javax.interceptor.api;

       exports org.glassfish.jersey.ext.cdi1x.validation.internal;
}

