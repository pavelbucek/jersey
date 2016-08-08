module org.glassfish.jersey.examples.xml.moxy {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.xmlmoxy;
       exports org.glassfish.jersey.examples.xmlmoxy.beans;

}
