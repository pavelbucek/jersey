module org.glassfish.jersey.ext.declarative.linking {

       requires transitive javax.el;
       requires transitive javax.el.api;
       requires transitive org.glassfish.jersey.core.common;
       requires transitive org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.linking;
       exports org.glassfish.jersey.linking.mapping;

}
