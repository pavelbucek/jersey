module org.glassfish.jersey.ext.rx.rx.client.guava {

       requires public guava;
       requires public org.glassfish.jersey.ext.rx.rx.client;

       exports org.glassfish.jersey.client.rx.guava;

       provides org.glassfish.jersey.client.rx.spi.RxInvokerProvider with org.glassfish.jersey.client.rx.guava.RxListenableFutureInvokerProvider;

}
