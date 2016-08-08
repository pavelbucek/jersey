module org.glassfish.jersey.ext.cdi.cdi1x.ban.custom.hk2.binding {

       requires transitive org.glassfish.jersey.ext.cdi.cdi1x;

       exports org.glassfish.jersey.ext.cdi1x.hk2ban;

       provides org.glassfish.jersey.ext.cdi1x.spi.Hk2CustomBoundTypesProvider with org.glassfish.jersey.ext.cdi1x.hk2ban.EmptyHk2CustomInjectionTypeProvider;

}
