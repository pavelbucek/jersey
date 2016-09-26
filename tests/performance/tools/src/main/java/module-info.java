module org.glassfish.jersey.tests.performance.tools.performance.test.tools {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.tests.performance.tools;

}
