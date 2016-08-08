module org.glassfish.jersey.tests.memleaks.redeployment.redeployment.no.app {

       requires transitive hk2.api;
       requires transitive hk2.locator;
       requires transitive hk2.utils;
       requires transitive javax.servlet.api;

       exports org.glassfish.jersey.tests.memleaks.nojersey;

}
