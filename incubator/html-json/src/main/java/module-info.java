module org.glassfish.jersey.media.html.json {

       requires public grizzly.framework;
       requires public javax.annotation.api;
       requires public javax.ws.rs.api;
       requires public ko.ws.tyrus;
       requires public net.java.html.json;
       requires public org.glassfish.jersey.core.client;
       requires public org.openide.util.lookup;

       exports org.glassfish.jersey.media.htmljson;
       exports org.glassfish.jersey.media.htmljson.internal;
}

