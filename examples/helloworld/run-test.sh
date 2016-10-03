mvn clean package -PcheckstyleSkip -Dmaven.test.skip dependency:copy-dependencies

mkdir ./target/dependency-cp
mv ./target/dependency/jersey-test-framework-* ./target/dependency-cp/

cp ./target/dependency/junit-4.12.jar ./target/dependency-cp/
cp ./target/dependency/hamcrest-core-1.3.jar ./target/dependency-cp/
cp ./target/helloworld.jar ./target/dependency/
cp ~/.m2/repository/org/osgi/org.osgi.core/4.2.0/org.osgi.core-4.2.0.jar ./target/dependency/

rm ./target/dependency/javax.inject-1.jar

export CP=`find ./target/dependency-cp | while read X ; do echo -n $X: ; done`
export MP=`find ./target/dependency | while read X ; do echo -n $X: ; done`


echo X
echo X
echo X
echo X
echo javac -p "$MP" -cp "$CP" --add-modules org.glassfish.jersey.examples.helloworld  $(find ./src/test -name "*.java")
# javac -p "$MP" -cp "$CP" --add-modules org.glassfish.jersey.examples.helloworld  $(find ./src/test -name "*.java")
mkdir ./target/test-classes
javac -cp "$CP":"$MP" -d target/test-classes $(find ./src/test -name "*.java")
echo X
echo X
echo X
echo X

# java -p "$MP" -cp "$CP":./target/test-classes org.junit.runner.JUnitCore org.glassfish.jersey.examples.helloworld.HelloWorldTest

java -p "$MP" -cp "$CP" --add-modules org.glassfish.jersey.examples.helloworld --patch-module org.glassfish.jersey.examples.helloworld=./target/test-classes --add-reads org.glassfish.jersey.examples.helloworld=ALL-UNNAMED  org.junit.runner.JUnitCore org.glassfish.jersey.examples.helloworld.HelloWorldTest
