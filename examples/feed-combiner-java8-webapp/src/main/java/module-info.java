module org.glassfish.jersey.examples.feed.combiner.java8.webapp {

       requires public logback.classic;
       requires public logback.core;
       requires public org.glassfish.jersey.containers.container.grizzly2.http;
       requires public org.glassfish.jersey.ext.bean.validation;
       requires public org.glassfish.jersey.ext.mvc.bean.validation;
       requires public org.glassfish.jersey.ext.mvc.freemarker;
       requires public org.glassfish.jersey.media.media.moxy;
       requires public rome;
       requires public slf4j.api;

       exports org.glassfish.jersey.examples.feedcombiner;
       exports org.glassfish.jersey.examples.feedcombiner.binder;
       exports org.glassfish.jersey.examples.feedcombiner.generator;
       exports org.glassfish.jersey.examples.feedcombiner.manager;
       exports org.glassfish.jersey.examples.feedcombiner.model;
       exports org.glassfish.jersey.examples.feedcombiner.provider;
       exports org.glassfish.jersey.examples.feedcombiner.resources;
       exports org.glassfish.jersey.examples.feedcombiner.service;
       exports org.glassfish.jersey.examples.feedcombiner.store;

}
