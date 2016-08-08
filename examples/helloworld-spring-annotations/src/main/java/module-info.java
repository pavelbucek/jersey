module org.glassfish.jersey.examples.helloworld.spring.annotations {

       requires public commons.logging;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.ext.spring4;
       requires public spring.web;

       exports org.glassfish.jersey.examples.hello.spring.annotations;
}

