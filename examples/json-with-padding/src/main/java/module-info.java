module org.glassfish.jersey.examples.json.with.padding {

       requires transitive jaxb.impl;
       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.media.media.moxy;

       exports org.glassfish.jersey.examples.jsonp;

}
