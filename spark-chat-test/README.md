# Installation

Spark-chat folder contains netbeans project.


1. Clone the repo and import/open project with netbeans.

2. This is a maven based project so once the project is imported you must build the 
dependencies. First, make sure you have the Java Platform the project will be using
to Java 8.X JDK. If Netbeans or the IDE you are using don't have at least Java 8
as the JDK being used, you can download and extract the JDK from Oracle's website.
Once you download the JDK from the site, extract it to something like this:
	'spark-chat-test/spark-chat-test/jdk1.8.0_92/'
Note: You may need to change the version number to the one you downloaded and 
modify the '.gitignore' file. Then go to tools for the project and select Java 
platforms and add a new Java platform to the JDK you downloaded and extracted. 
Set the project to use that platform. Then right click on the project's folder 
and then go to properties. Then go to build then to compile and select the new 
Java Platform you just created.

3. Once the project is imported and Java platform set to Java 8, you will then
go to the project's root folder in the project pane of netbeans. Right click on it
and then click on 'build with dependencies". Once everything is built you can now run
the application. 

# Usage

1. Open up multiple tabs in a browser and visit 'localhost:4567'
