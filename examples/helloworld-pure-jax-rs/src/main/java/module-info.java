module org.glassfish.jersey.examples.helloworld.pure.jax.rs {

       requires transitive org.glassfish.jersey.containers.container.jdk.http;
       requires transitive org.glassfish.jersey.core.client;

       exports org.glassfish.jersey.examples.helloworld.jaxrs;

}
