module org.glassfish.jersey.ext.mvc {

       requires public javax.servlet.api;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.server.mvc;
       exports org.glassfish.jersey.server.mvc.internal;
       exports org.glassfish.jersey.server.mvc.spi;

}
