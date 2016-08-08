module org.glassfish.jersey.tests.integration.cdi.beanvalidation.webapp {

       requires public cdi.api;
       requires public hibernate.validator.cdi;
       requires public javax.annotation.api;
       requires public javax.ws.rs.api;
       requires public org.glassfish.jersey.ext.bean.validation;
       requires public org.glassfish.jersey.ext.cdi.cdi1x;
       requires public org.glassfish.jersey.ext.cdi.cdi1x.validation;
       requires public org.glassfish.jersey.ext.cdi.weld2.se;
        requires public weld.core.impl; // move to org.glassfish.jersey.ext.cdi.weld2.se?

       exports org.glassfish.jersey.tests.cdi.bv;
}

