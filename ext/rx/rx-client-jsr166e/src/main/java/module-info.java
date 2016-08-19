module org.glassfish.jersey.ext.rx.rx.client.jsr166e {

       requires public org.glassfish.jersey.bundles.repackaged.jsr166e;
       requires public org.glassfish.jersey.ext.rx.rx.client;

       exports org.glassfish.jersey.client.rx.jsr166e;

       provides org.glassfish.jersey.client.rx.spi.RxInvokerProvider with org.glassfish.jersey.client.rx.jsr166e.RxCompletableFutureInvokerProvider;

}
