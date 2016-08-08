module org.glassfish.jersey.ext.mvc {

       requires public org.glassfish.jersey.core.server;
       requires public javax.servlet.api;

       exports org.glassfish.jersey.server.mvc;
       exports org.glassfish.jersey.server.mvc.internal;
       exports org.glassfish.jersey.server.mvc.spi;
}

