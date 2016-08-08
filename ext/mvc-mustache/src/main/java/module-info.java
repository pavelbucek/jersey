module org.glassfish.jersey.ext.mvc.mustache {

       requires transitive compiler;
       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.ext.mvc;

       exports org.glassfish.jersey.server.mvc.mustache;

}
