module org.glassfish.jersey.tests.integration.2335 {

       requires public org.glassfish.jersey.containers.container.servlet.core;
       requires public org.glassfish.jersey.ext.metainf.services;

       exports org.glassfish.jersey.tests.integration.jersey2335;

       provides javax.ws.rs.ext.MessageBodyWriter with org.glassfish.jersey.tests.integration.jersey2335.ConstructorInjectedProvider;
       provides javax.ws.rs.ext.MessageBodyWriter with org.glassfish.jersey.tests.integration.jersey2335.FieldInjectedProvider;

}
