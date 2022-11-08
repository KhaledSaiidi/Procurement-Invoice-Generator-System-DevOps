# Procurement-Invoice-Generator-System
This Devops project is composed of two parts: 
The first part is the development of the backend system part using SpringBoot. 
The second part is the automation of the devops part through a pipeline script in Jenkins started by a push.
Using Vagrant software, we built and maintained a Centos7 environment to work on a virtual machine.




Using Docker-Compose, we developed to define and share multi-container applications:
* Java -jar to compile and build our project locally and read the .jar version of our released artifact.
* MySql to create a local database for Junit and Mocks tests.
* Sonarqube to search for bugs, vulnerabilities and redundancies, then fix them to get a cleaner code.
* Sonatype/Nexus to organize, store and distribute our generated artifact needed for development.


Finally, we used Jenkins to automate the build, test and deployment parts of software development by starting when a git push is performed.
The Pipline script is added to the project in a text file named PiplineScript.


