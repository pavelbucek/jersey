module org.glassfish.jersey.ext.entity.filtering {

       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.message.filtering;
       exports org.glassfish.jersey.message.filtering.spi;

}
