module org.glassfish.jersey.ext.cdi.cdi1x.transaction {

       requires transitive javax.interceptor.api;
       requires transitive javax.transaction.api;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;

       exports org.glassfish.jersey.ext.cdi1x.transaction.internal;

       provides javax.enterprise.inject.spi.Extension with org.glassfish.jersey.ext.cdi1x.transaction.internal.TransactionalExceptionInterceptorProvider;
       provides org.glassfish.jersey.server.spi.ComponentProvider with org.glassfish.jersey.ext.cdi1x.transaction.internal.TransactionalExceptionInterceptorProvider;

}
