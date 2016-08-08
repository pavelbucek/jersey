module org.glassfish.jersey.examples.bean.validation.webapp {

       requires public org.glassfish.jersey.ext.bean.validation;
       requires public org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.beanvalidation.webapp;
       exports org.glassfish.jersey.examples.beanvalidation.webapp.constraint;
       exports org.glassfish.jersey.examples.beanvalidation.webapp.domain;
       exports org.glassfish.jersey.examples.beanvalidation.webapp.resource;
       exports org.glassfish.jersey.examples.beanvalidation.webapp.service;
}

