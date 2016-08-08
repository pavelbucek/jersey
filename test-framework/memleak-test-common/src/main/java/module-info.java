module org.glassfish.jersey.test.framework.memleak.test.common {

       requires transitive guava;
       requires transitive junit;
       requires transitive org.glassfish.jersey.test.framework.providers.test.framework.provider.external;

       exports org.glassfish.jersey.test.memleak.common;

}
