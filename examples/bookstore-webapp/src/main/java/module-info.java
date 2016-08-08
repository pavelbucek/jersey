module org.glassfish.jersey.examples.bookstore.webapp {

       requires public jstl;
       requires public org.glassfish.jersey.ext.mvc.jsp;
        // requires public servlet.api;
        requires public javax.servlet.api;

       exports org.glassfish.jersey.examples.bookstore.webapp;
       exports org.glassfish.jersey.examples.bookstore.webapp.resource;
}

