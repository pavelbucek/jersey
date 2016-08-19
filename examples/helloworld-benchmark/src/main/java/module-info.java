module org.glassfish.jersey.examples.helloworld.benchmark {

       requires public jmh.core;
       requires public jmh.generator.annprocess;
       requires public org.glassfish.jersey.core.server;
       requires public org.glassfish.jersey.test.framework.test.framework.util;

       exports org.glassfish.jersey.examples.helloworld;

}
