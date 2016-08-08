module org.glassfish.jersey.examples.shortener.webapp {

       requires public javax.el.api;
       requires public org.glassfish.jersey.ext.mvc.bean.validation;
       requires public org.glassfish.jersey.ext.mvc.mustache;

       exports org.glassfish.jersey.examples.shortener.webapp;
       exports org.glassfish.jersey.examples.shortener.webapp.domain;
       exports org.glassfish.jersey.examples.shortener.webapp.resource;
       exports org.glassfish.jersey.examples.shortener.webapp.service;
       exports org.glassfish.jersey.examples.shortener.webapp.validation;
}

