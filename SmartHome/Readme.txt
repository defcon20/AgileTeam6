Setting up your Dev Environment:

Step One:
	Download and install Gradle
	Extract Gradle
	Add Gradle.exe to PATH environment variable
	
Step Two:
	Download and install Tomcat
	
Step Three:
	Download Gradle for Eclipse 4.4 plugin for Eclipse
	Restart Eclipse
	Import project as Gradle Project
	
To Build:
	In Command Line, navigate to project directory
		gradle clean war
	Move generated war file to {Tomcat}/webapps
	In Command Line, navigate to {Tomcat}/bin
		startup
	Now your server should be running
		In browser, go to http://localhost:8080/SmartHome-0.0/rest/hello
	
