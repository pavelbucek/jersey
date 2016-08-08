module org.glassfish.jersey.tests.integration.2689 {

       requires transitive jackson.annotations;
       requires transitive jackson.core;
       requires transitive jackson.databind;
       requires transitive jackson.jaxrs.json.provider;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.ext.bean.validation;

       exports org.glassfish.jersey.tests.integration.jersey2689;

}
