module org.glassfish.jersey.test.framework.maven.custom.enforcer.rules {

       requires public commons.io;
       requires public enforcer.rules;
       requires public guava;
       requires public maven.enforcer.plugin;

       exports org.glassfish.jersey.test.maven.rule;

}
