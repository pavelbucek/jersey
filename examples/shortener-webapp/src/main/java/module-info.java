module org.glassfish.jersey.examples.shortener.webapp {

       requires transitive javax.el.api;
       requires transitive org.glassfish.jersey.ext.mvc.bean.validation;
       requires transitive org.glassfish.jersey.ext.mvc.mustache;

       exports org.glassfish.jersey.examples.shortener.webapp;
       exports org.glassfish.jersey.examples.shortener.webapp.domain;
       exports org.glassfish.jersey.examples.shortener.webapp.resource;
       exports org.glassfish.jersey.examples.shortener.webapp.service;
       exports org.glassfish.jersey.examples.shortener.webapp.validation;

}
