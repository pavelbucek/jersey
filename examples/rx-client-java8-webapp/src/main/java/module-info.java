module org.glassfish.jersey.examples.rx.client.java8.webapp {

       requires transitive org.glassfish.jersey.containers.container.servlet;
       requires transitive org.glassfish.jersey.ext.rx.rx.client.guava;
       requires transitive org.glassfish.jersey.ext.rx.rx.client.java8;
       requires transitive org.glassfish.jersey.ext.rx.rx.client.rxjava;
       requires transitive org.glassfish.jersey.media.media.json.jackson;

       exports org.glassfish.jersey.examples.rx;
       exports org.glassfish.jersey.examples.rx.agent;
       exports org.glassfish.jersey.examples.rx.domain;
       exports org.glassfish.jersey.examples.rx.remote;

}
