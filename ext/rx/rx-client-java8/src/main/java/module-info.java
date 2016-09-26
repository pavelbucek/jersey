module org.glassfish.jersey.ext.rx.rx.client.java8 {

       requires transitive org.glassfish.jersey.ext.rx.rx.client;

       exports org.glassfish.jersey.client.rx.java8;

       provides org.glassfish.jersey.client.rx.spi.RxInvokerProvider with org.glassfish.jersey.client.rx.java8.RxCompletionStageInvokerProvider;

}
