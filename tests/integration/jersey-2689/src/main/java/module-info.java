module org.glassfish.jersey.tests.integration.2689 {

       requires public jackson.annotations;
       requires public jackson.core;
       requires public jackson.databind;
       requires public jackson.jaxrs.json.provider;
       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.ext.bean.validation;

       exports org.glassfish.jersey.tests.integration.jersey2689;
}

