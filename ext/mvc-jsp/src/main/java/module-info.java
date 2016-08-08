module org.glassfish.jersey.ext.mvc.jsp {

       requires transitive javax.inject;
       requires transitive javax.servlet.api;
       requires transitive jsp.api;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.ext.mvc;

       exports org.glassfish.jersey.server.mvc.jsp;

}
