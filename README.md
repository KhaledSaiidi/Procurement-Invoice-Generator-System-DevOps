# Procurement-Invoice-Generator-System
This Devops project is composed of two parts: 
The first part is the development of the backend system part using SpringBoot. 
The second part is setting up a pipeline for the first part.
A set of automated processes and tools to facilitate the development and deployment of code in a production environment.
We built and maintained the production in a Centos7 environment on a virtual machine.

Technology:
* Jenkins: For continuous integration and automation of the devops chain.
    The Pipline script is added to the project in a text file named PiplineScript.
* GitHub : For version control.
* Junit: For unit test management.
* Nexus: For the construction of depot and hosting of artifacts
* Sonar: To ensure clean code quality, good security, minimize vulnerabilities and redundancies, and resolve more bugs.
* Docker-Compose, we developed to define and share multi-container applications:
        - Java -jar to compile and build our project locally.
        - MySql to create a local database for Junit and Mocks tests.
        - Sonarqube.
        - Sonatype/Nexus.





