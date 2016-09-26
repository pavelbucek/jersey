module org.glassfish.jersey.examples.helloworld.weld {

       requires transitive org.glassfish.jersey.containers.container.grizzly2.http;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;
       requires transitive org.glassfish.jersey.ext.cdi.weld2.se;

       exports org.glassfish.jersey.examples.helloworld;

}
