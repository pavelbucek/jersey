module org.glassfish.jersey.tests.integration.cdi.beanvalidation.webapp {

       requires public cdi.api;
       requires public hibernate.validator.cdi;
       requires public javax.annotation.api;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.ext.bean.validation;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
       requires public org.glassfish.jersey.ext.cdi.cdi1x.validation;
       requires public org.glassfish.jersey.ext.cdi.weld2.se;
       requires public weld.core.impl; // move to org.glassfish.jersey.ext.cdi.weld2.se;

       exports org.glassfish.jersey.tests.cdi.bv;

       provides javax.enterprise.inject.spi.Extension with org.glassfish.jersey.tests.cdi.bv.CdiValidationResultBinder;
       provides org.glassfish.jersey.server.spi.ComponentProvider with org.glassfish.jersey.tests.cdi.bv.CdiValidationResultBinder;

}
