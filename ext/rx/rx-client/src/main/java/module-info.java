module org.glassfish.jersey.ext.rx.rx.client {

       requires transitive org.glassfish.jersey.core.client;

       exports org.glassfish.jersey.client.rx;
       exports org.glassfish.jersey.client.rx.spi;

        uses org.glassfish.jersey.client.rx.spi.RxInvokerProvider;
}
