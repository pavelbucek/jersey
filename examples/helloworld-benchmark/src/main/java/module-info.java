module org.glassfish.jersey.examples.helloworld.benchmark {

       requires transitive jmh.core;
       requires transitive jmh.generator.annprocess;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.test.framework.test.framework.util;

       exports org.glassfish.jersey.examples.helloworld;

}
