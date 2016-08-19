module org.glassfish.jersey.examples.bookstore.webapp {

       requires public javax.servlet.api;
       requires public jstl;
       requires public org.glassfish.jersey.ext.mvc.jsp;

       exports org.glassfish.jersey.examples.bookstore.webapp;
       exports org.glassfish.jersey.examples.bookstore.webapp.resource;

}
