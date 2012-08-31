Steps for installing and running Demo app.
Download Maven from http://maven.apache.org/download.html

Unpackage and add the bin folder to your Path variable

Download the android-sdk. Download Android 4.0 SDK with Google APIs
through the SDK tool.  Also download the Extras packages.
THESE NEED TO BE INSTALLED DUE TO DEPENDENCIES WITH ROBOLECTRIC.

Add the android-sdk directory to your environment variables as ANDROID_HOME.
Add the java jdk directory to your environment variables as JAVA_HOME.

Log out / in to refresh the environment.  If everthing is set up correctly
at this point, you should be able to type mvn -version from a console and
have version information displayed for maven as well as the jdk.

The android jars need to be deployed to your local repository to do this:

git clone git://github.com/mosabua/maven-android-sdk-deployer.git
cd maven-android-sdk-deployer
mvn install -P 4.0

Navigate to where you would like to create a git repository:

git clone git@github.com:Harahel/android-maven.git
cd android-maven
cd demo
mvn clean install android:deploy android:run

This should run the project on any connected device or running emulator.

------------------------------------------------------------------------
The project can be configured to run with Netbeans.  All that needs to be
done is add the nbandroid plugin to netbeans.  Follow the directions at:
http://www.nbandroid.org/2012/06/did-you-ask-for-maven.html

After this has completed, just open up the maven project and everything
should be ready to go.

------------------------------------------------------------------------
ORMLite Documentation
http://ormlite.com/javadoc/ormlite-core/doc-files/ormlite.html#SEC_Top

RoboGuice Tutorial
http://www.blog.project13.pl/wp-content/uploads/2011/12/presentation.html#slide1