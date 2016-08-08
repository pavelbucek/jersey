module org.glassfish.jersey.tests.memleaks.redeployment.redeployment.no.app {

       requires public hk2.api;
       requires public hk2.locator;
       requires public hk2.utils;
       requires public javax.servlet.api;

       exports org.glassfish.jersey.tests.memleaks.nojersey;
}

