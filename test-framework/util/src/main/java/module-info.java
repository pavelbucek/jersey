module org.glassfish.jersey.test.framework.test.framework.util {

       requires public org.glassfish.jersey.core.client;
       requires public org.glassfish.jersey.core.server;
        requires public junit;

        // exports org.glassfish.jersey.test.util;
       exports org.glassfish.jersey.test.util.client;
       exports org.glassfish.jersey.test.util.runner;
       exports org.glassfish.jersey.test.util.server;
}

