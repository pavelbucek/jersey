mvn clean package -PcheckstyleSkip -Dmaven.test.skip dependency:copy-dependencies -DincludeScope=runtime

cp ./target/helloworld.jar ./target/dependency/

cp ~/.m2/repository/org/osgi/org.osgi.core/4.2.0/org.osgi.core-4.2.0.jar ./target/dependency/

export MP=`find ./target/dependency | while read X ; do echo -n $X: ; done`

echo =
echo =
echo =
echo =
echo ==========
echo java -p "$MP" -m org.glassfish.jersey.examples.helloworld/org.glassfish.jersey.examples.helloworld.App
echo ==========
java -p "$MP" -m org.glassfish.jersey.examples.helloworld/org.glassfish.jersey.examples.helloworld.App
