module org.glassfish.jersey.test.performance.monitoring.monitoring {

       requires public commons.codec;
       requires public commons.lang;
       requires public guava;
       requires public metrics.core;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public slf4j.jdk14;

       exports org.glassfish.jersey.tests.performance.monitoring;
}

