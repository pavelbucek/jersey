module org.glassfish.jersey.tests.integration.1667 {

       requires transitive javax.servlet.api;
       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.media.media.multipart;

       exports org.glassfish.jersey.tests.integration.jersey1667;

}
