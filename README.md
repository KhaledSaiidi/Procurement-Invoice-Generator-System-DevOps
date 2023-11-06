Procurement-Invoice-Generator-System-DevOps

Overview
Welcome to the Procurement-Invoice-Generator-System-DevOps project. This repository is dedicated to the setup and integration of various DevOps tools for the Procurement Invoice Generator System, which is built using Spring Boot. Our goal is to streamline the development, testing, and deployment processes, ensuring the system's reliability and efficiency.

Getting Started
Let's delve into the key phases of the Procurement-Invoice-Generator-System-DevOps project:

Step 1: Creating the Spring Boot Application
In the initial step, we focused on developing the backend system using Spring Boot. This system generates invoices for procurement operations between clients and suppliers after product orders. It also ensures that these operations comply with legal requirements for their respective categories.

Step 2: Implementing Logging and Unit Testing
Our commitment to quality extends to implementing some logging and conducting unit testing for the Spring Boot application. This ensures that our system operates reliably and is resilient to potential issues.

Step 3: Setting up VirtualBox and Vagrant
The next phase involved setting up VirtualBox and Vagrant. These tools allow us to create and manage virtual development environments, ensuring a consistent and reproducible setup for our DevOps processes.

Step 4: Installing Jenkins in CentOS
Jenkins, a vital component of our DevOps pipeline, was installed on a CentOS server. Jenkins automates continuous integration, ensuring that code changes are regularly integrated and tested.

Step 5: Installing Docker in CentOS
We also installed Docker on our CentOS server. Docker enables containerization, simplifying the deployment of applications and services while maintaining isolation and reproducibility.

Step 6: Nexus in a Docker Container
Nexus, a repository manager, was set up in a Docker container. This allows us to efficiently manage dependencies and artifacts, enhancing the reliability of our builds.

Step 7: Sonar in a Docker Container
In this step, we configured Sonar in a Docker container. Sonar helps maintain code quality by analyzing the Spring Boot project for potential issues and inefficiencies.

Step 8: Linking Jenkins to Docker
Jenkins was connected to Docker to automate the building and deployment of the Spring Boot application. This integration streamlines our continuous integration and continuous delivery (CI/CD) pipeline.

Step 9: Completing the Pipeline with Jenkins
We designed a Jenkins pipeline that orchestrates the entire DevOps process, from building to testing and deploying the Spring Boot application. This comprehensive pipeline ensures that our system remains reliable and up to date.

Step 10: Setting up Grafana & Prometheus
To monitor and visualize system performance, we deployed Grafana and Prometheus in Docker containers. This setup enables us to gain insights into the behavior of our application and infrastructure.

Contribution
We encourage contributions to this project. If you have ideas, improvements, or bug fixes, feel free to fork this repository and submit pull requests. Collaboration is key to the success of any DevOps project.



