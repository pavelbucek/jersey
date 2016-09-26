module org.glassfish.jersey.tools.plugins.doc.modulelist.maven.plugin {

       requires transitive maven.artifact;
       requires transitive maven.core;
       requires transitive maven.dependency.tree;
       requires transitive maven.plugin.api;

       exports org.glassfish.jersey.tools.plugins;

}
