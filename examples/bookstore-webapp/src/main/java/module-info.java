module org.glassfish.jersey.examples.bookstore.webapp {

       requires transitive javax.servlet.api;
       requires transitive jstl;
       requires transitive org.glassfish.jersey.ext.mvc.jsp;

       exports org.glassfish.jersey.examples.bookstore.webapp;
       exports org.glassfish.jersey.examples.bookstore.webapp.resource;

}
