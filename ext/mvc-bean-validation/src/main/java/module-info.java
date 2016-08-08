module org.glassfish.jersey.ext.mvc.bean.validation {

       requires transitive org.glassfish.jersey.ext.bean.validation;
       requires transitive org.glassfish.jersey.ext.mvc;

       exports org.glassfish.jersey.server.mvc.beanvalidation;

}
