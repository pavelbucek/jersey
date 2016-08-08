module org.glassfish.jersey.ext.rx.rx.client.guava {

       requires transitive guava;
       requires transitive org.glassfish.jersey.ext.rx.rx.client;

       exports org.glassfish.jersey.client.rx.guava;

       provides org.glassfish.jersey.client.rx.spi.RxInvokerProvider with org.glassfish.jersey.client.rx.guava.RxListenableFutureInvokerProvider;

}
