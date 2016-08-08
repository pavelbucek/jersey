module org.glassfish.jersey.ext.wadl.doclet {

       requires transitive jdk.javadoc;
       requires transitive org.glassfish.jersey.core.server;
       requires transitive xercesImpl;

       exports org.glassfish.jersey.wadl.doclet;

}
