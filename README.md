SwitchYard Hello WebService
========================

What is it?
-----------

This is a sample project for SwitchYard demonstrating how to expose a Bean Service with a public Web Service using SOAP binding

System requirements
-------------------

All you need to build this project is Java 6.0 (Java SDK 1.6) or better, Maven 3.0 or better. To run the example you also need to download and install SwitchYard from http://jboss.org/switchyard


Build the application
-------------------------

1. Build the application by executing the following command:

        $ mvn clean package
		
2. Deploy the application by executing the following command with SwitchYard running on localhost:9999:
	
        $ mvn jboss-as:deploy
	

Undeploy the Archive
--------------------

1. Make sure you have started the SwitchYard Server as described above.
2. Open a command line and navigate to the root directory of this project.
3. When you are finished testing, type this command to undeploy the archive:

        mvn jboss-as:undeploy

Debug the Application
------------------------------------

If you want to debug the source code or look at the Javadocs of any library in the project, run either of the following commands to pull them into your local repository. The IDE should then detect them.

        mvn dependency:sources
        mvn dependency:resolve -Dclassifier=javadoc