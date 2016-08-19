module org.glassfish.jersey.examples.helloworld.weld {

       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
       requires public org.glassfish.jersey.ext.cdi.weld2.se;

       exports org.glassfish.jersey.examples.helloworld;

}
