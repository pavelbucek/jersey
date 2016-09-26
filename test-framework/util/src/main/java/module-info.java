module org.glassfish.jersey.test.framework.test.framework.util {

       requires transitive junit;
       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.test.util.client;
       exports org.glassfish.jersey.test.util.runner;
       exports org.glassfish.jersey.test.util.server;

}
