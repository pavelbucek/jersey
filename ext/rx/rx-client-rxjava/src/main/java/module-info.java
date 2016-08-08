module org.glassfish.jersey.ext.rx.rx.client.rxjava {

       requires transitive org.glassfish.jersey.ext.rx.rx.client;
       requires transitive rxjava;

       exports org.glassfish.jersey.client.rx.rxjava;

       provides org.glassfish.jersey.client.rx.spi.RxInvokerProvider with org.glassfish.jersey.client.rx.rxjava.RxObservableInvokerProvider;

}
