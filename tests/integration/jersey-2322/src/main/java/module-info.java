module org.glassfish.jersey.tests.integration.2322 {

       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.ext.metainf.services;
       requires transitive org.glassfish.jersey.media.media.json.jackson;

       exports org.glassfish.jersey.tests.integration.jersey2322;

}
