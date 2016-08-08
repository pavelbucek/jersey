module org.glassfish.jersey.ext.declarative.linking {

       requires public javax.el;
       requires public javax.el.api;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.linking;
       exports org.glassfish.jersey.linking.mapping;
}

