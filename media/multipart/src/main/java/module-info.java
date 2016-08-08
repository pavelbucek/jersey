module org.glassfish.jersey.media.media.multipart {

       requires public mimepull;
       requires public org.glassfish.jersey.core.common;
       requires public org.glassfish.jersey.core.server;

       exports org.glassfish.jersey.media.multipart;
       exports org.glassfish.jersey.media.multipart.file;
       exports org.glassfish.jersey.media.multipart.internal;
}

