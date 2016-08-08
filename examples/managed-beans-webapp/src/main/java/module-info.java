module org.glassfish.jersey.examples.managed.beans.webapp {

       requires public cdi.api;
       requires public javax.annotation.api;
       requires public javax.ws.rs.api;
       requires public persistence.api;
        requires public javax.inject;
        requires public javax.interceptor.api;


       exports org.glassfish.jersey.examples.managedbeans.resources;
}

