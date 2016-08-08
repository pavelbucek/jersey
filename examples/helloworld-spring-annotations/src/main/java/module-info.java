module org.glassfish.jersey.examples.helloworld.spring.annotations {

       requires transitive commons.logging;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.ext.spring4;
       requires transitive spring.web;

       exports org.glassfish.jersey.examples.hello.spring.annotations;

}
