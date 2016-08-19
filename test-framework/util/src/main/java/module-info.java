module org.glassfish.jersey.test.framework.test.framework.util {

       requires public junit;
       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.test.util.client;
       exports org.glassfish.jersey.test.util.runner;
       exports org.glassfish.jersey.test.util.server;

}
