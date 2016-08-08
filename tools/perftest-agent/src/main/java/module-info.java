module org.glassfish.jersey.test.performance.agent.perftest.agent {

       requires transitive javassist;
       requires transitive metrics.core;

       exports org.glassfish.jersey.perftest.agent;

}
