module org.glassfish.jersey.test.performance.monitoring.monitoring {

       requires transitive commons.codec;
       requires transitive commons.lang;
       requires transitive guava;
       requires transitive metrics.core;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive slf4j.jdk14;

       exports org.glassfish.jersey.tests.performance.monitoring;

}
