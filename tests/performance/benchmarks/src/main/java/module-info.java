module org.glassfish.jersey.tests.performance.performance.test.benchmarks {

       requires public jmh.core;
       requires public jmh.generator.annprocess;
       requires public org.glassfish.jersey.connectors.grizzly.connector;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.media.media.json.jackson;
       requires public org.glassfish.jersey.test.framework.test.framework.util;

       exports org.glassfish.jersey.tests.performance.benchmark;
       exports org.glassfish.jersey.tests.performance.benchmark.entity.json;
       exports org.glassfish.jersey.tests.performance.benchmark.server;

}
