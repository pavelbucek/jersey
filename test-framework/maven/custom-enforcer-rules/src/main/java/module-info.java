module org.glassfish.jersey.test.framework.maven.custom.enforcer.rules {

       requires public commons.io;
       requires public guava;
       requires public maven.enforcer.plugin;
        requires public enforcer.rules;

       exports org.glassfish.jersey.test.maven.rule;
}

