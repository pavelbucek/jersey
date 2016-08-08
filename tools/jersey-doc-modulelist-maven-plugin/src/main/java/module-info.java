module org.glassfish.jersey.tools.plugins.doc.modulelist.maven.plugin {

       requires public maven.artifact;
       requires public maven.core;
       requires public maven.dependency.tree;
       requires public maven.plugin.api;

       exports org.glassfish.jersey.tools.plugins;
}

