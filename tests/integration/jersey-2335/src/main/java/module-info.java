module org.glassfish.jersey.tests.integration.2335 {

       requires transitive org.glassfish.jersey.containers.container.servlet.core;
       requires transitive org.glassfish.jersey.ext.metainf.services;

       exports org.glassfish.jersey.tests.integration.jersey2335;

       provides javax.ws.rs.ext.MessageBodyWriter with org.glassfish.jersey.tests.integration.jersey2335.ConstructorInjectedProvider;
       provides javax.ws.rs.ext.MessageBodyWriter with org.glassfish.jersey.tests.integration.jersey2335.FieldInjectedProvider;

}
