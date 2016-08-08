module org.glassfish.jersey.ext.mvc {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.server.mvc;
       exports org.glassfish.jersey.server.mvc.internal;
       exports org.glassfish.jersey.server.mvc.spi;

}
