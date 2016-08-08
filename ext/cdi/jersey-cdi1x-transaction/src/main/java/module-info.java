module org.glassfish.jersey.ext.cdi.cdi1x.transaction {

       // requires public javaee.api;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
        requires public javax.interceptor.api;
        requires public javax.transaction.api;

       exports org.glassfish.jersey.ext.cdi1x.transaction.internal;
}

