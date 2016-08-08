module org.glassfish.jersey.tests.integration.cdi.beanvalidation.webapp {

       requires transitive cdi.api;
       requires transitive hibernate.validator.cdi;
       requires transitive javax.annotation.api;
       requires transitive javax.ws.rs.api;
       requires transitive org.glassfish.jersey.ext.bean.validation;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;
       requires transitive org.glassfish.jersey.ext.cdi.cdi1x.validation;
       requires transitive org.glassfish.jersey.ext.cdi.weld2.se;
       requires transitive weld.core.impl; // move to org.glassfish.jersey.ext.cdi.weld2.se;

       exports org.glassfish.jersey.tests.cdi.bv;

       provides javax.enterprise.inject.spi.Extension with org.glassfish.jersey.tests.cdi.bv.CdiValidationResultBinder;
       provides org.glassfish.jersey.server.spi.ComponentProvider with org.glassfish.jersey.tests.cdi.bv.CdiValidationResultBinder;

}
