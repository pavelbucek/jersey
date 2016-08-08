module org.glassfish.jersey.media.media.moxy {

       requires public org.eclipse.persistence.moxy;
       requires public org.eclipse.persistence.core;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.ext.entity.filtering;
        requires public java.xml;

       exports org.glassfish.jersey.moxy.internal;
       exports org.glassfish.jersey.moxy.json;
       exports org.glassfish.jersey.moxy.json.internal;
       exports org.glassfish.jersey.moxy.xml;
}

