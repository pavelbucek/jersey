module org.glassfish.jersey.examples.rx.client.java8.webapp {

       requires public org.glassfish.jersey.containers.container.servlet;
       requires public org.glassfish.jersey.ext.rx.rx.client.guava;
       requires public org.glassfish.jersey.ext.rx.rx.client.java8;
       requires public org.glassfish.jersey.ext.rx.rx.client.rxjava;
       requires public org.glassfish.jersey.media.media.json.jackson;

       exports org.glassfish.jersey.examples.rx;
       exports org.glassfish.jersey.examples.rx.agent;
       exports org.glassfish.jersey.examples.rx.domain;
       exports org.glassfish.jersey.examples.rx.remote;
}

