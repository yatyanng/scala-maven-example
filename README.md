# scala-maven-example
Scala Maven project example.

Simple project with no interesting code, only to show how to use scala-maven-plugin with apache-shade-plugin.

This project was edited using Scala IDE 4.7 (Windows version) - see http://scala-ide.org/download/sdk.html

I have tested this app by create a JAR file (mvn clean package) and running in WSL2
 
The Spark master and worker must be started before running the jar file.

<pre>
 java -jar scala-maven-example-X.X.X.jar spark://{MASTER_IP}:7077 people.json
 </pre>