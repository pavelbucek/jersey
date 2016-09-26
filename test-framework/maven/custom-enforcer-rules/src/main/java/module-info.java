module org.glassfish.jersey.test.framework.maven.custom.enforcer.rules {

       requires transitive commons.io;
       requires transitive enforcer.rules;
       requires transitive guava;
       requires transitive maven.enforcer.plugin;

       exports org.glassfish.jersey.test.maven.rule;

}
