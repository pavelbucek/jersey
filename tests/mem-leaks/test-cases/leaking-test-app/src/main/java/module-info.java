module org.glassfish.jersey.tests.memleaks.testcases.leaking.test.app {

       requires transitive guava;
       requires transitive org.glassfish.jersey.containers.container.servlet;

       exports org.glassfish.jersey.tests.memleaks.testleak;

}
