module org.glassfish.jersey.test.framework.providers.test.framework.provider.netty {

       requires transitive org.glassfish.jersey.containers.container.netty.http;
       requires transitive org.glassfish.jersey.test.framework.test.framework.core;

       exports org.glassfish.jersey.test.netty;

       provides org.glassfish.jersey.test.spi.TestContainerFactory with org.glassfish.jersey.test.netty.NettyTestContainerFactory;

}
