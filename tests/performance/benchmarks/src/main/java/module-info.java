module org.glassfish.jersey.tests.performance.performance.test.benchmarks {

       requires transitive jmh.core;
       requires transitive jmh.generator.annprocess;
       requires transitive org.glassfish.jersey.connectors.grizzly.connector;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.media.media.json.jackson;
       requires transitive org.glassfish.jersey.test.framework.test.framework.util;

       exports org.glassfish.jersey.tests.performance.benchmark;
       exports org.glassfish.jersey.tests.performance.benchmark.entity.json;
       exports org.glassfish.jersey.tests.performance.benchmark.server;

}
