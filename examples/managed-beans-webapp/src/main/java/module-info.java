module org.glassfish.jersey.examples.managed.beans.webapp {

       requires transitive cdi.api;
       requires transitive javax.annotation.api;
       requires transitive javax.inject;
       requires transitive javax.interceptor.api;
       requires transitive javax.ws.rs.api;
       requires transitive persistence.api;

       exports org.glassfish.jersey.examples.managedbeans.resources;

}
