module org.glassfish.jersey.examples.reload {

       requires transitive java.compiler;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;

       exports org.glassfish.jersey.examples.reload;
       exports org.glassfish.jersey.examples.reload.compiler;

}
