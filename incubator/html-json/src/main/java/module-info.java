module org.glassfish.jersey.media.html.json {

       requires transitive grizzly.framework;
       requires transitive javax.annotation.api;
       requires transitive javax.ws.rs.api;
       requires transitive ko.ws.tyrus;
       requires transitive net.java.html.json;
       requires transitive org.glassfish.jersey.core.client;
       requires transitive org.openide.util.lookup;

       exports org.glassfish.jersey.media.htmljson;
       exports org.glassfish.jersey.media.htmljson.internal;

       provides org.glassfish.jersey.internal.spi.AutoDiscoverable with org.glassfish.jersey.media.htmljson.internal.HtmlJsonAutoDiscoverable;

}
