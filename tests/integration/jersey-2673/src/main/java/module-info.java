module org.glassfish.jersey.tests.integration.2673 {

       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.ext.bean.validation;
       requires transitive org.glassfish.jersey.media.media.json.jackson;

       exports org.glassfish.jersey.tests.integration.jersey2673;

}
