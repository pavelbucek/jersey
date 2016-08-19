module org.glassfish.jersey.tests.memleaks.testcases.leaking.test.app {

       requires public guava;
       requires public org.glassfish.jersey.containers.container.servlet;

       exports org.glassfish.jersey.tests.memleaks.testleak;

}
