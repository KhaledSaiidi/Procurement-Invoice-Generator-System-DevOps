# ⚙️ Procurement Invoice Generator – DevOps Automation

This project delivers a robust and fully automated **DevOps pipeline** tailored for a Spring Boot–based procurement system. It leverages infrastructure-as-code and containerization to ensure a reproducible and scalable CI/CD and monitoring setup across virtual environments.

---

## 🚀 Project Objectives

### 🏗️ Infrastructure & Automation

- 🧱 **VirtualBox & Vagrant** for reproducible infrastructure.
- 🖥️ Provision **CentOS-based VMs** for local DevOps labs.

### 🔁 CI/CD Pipeline Automation

- ⚙️ Use **Jenkins** to automate build, test, and deployment stages.
- 🐳 **Dockerize** all components for consistent delivery.
- 📦 Manage build artifacts with **Nexus Repository**.
- 🔍 Ensure code quality using **SonarQube**.

### 📊 Monitoring & Observability

- 📈 Deploy **Prometheus & Grafana** for performance and metrics visualization.
- 🔗 Ensure the DevOps pipeline is fully observable and auditable.

---

## 🛠️ DevOps Tools Used

| Tool        | Purpose |
|-------------|---------|
| ![Jenkins](https://img.shields.io/badge/Jenkins-%232C5263.svg?style=for-the-badge&logo=jenkins&logoColor=white) | Automates CI/CD processes for the Spring Boot application |
| ![Docker](https://img.shields.io/badge/Docker-2496ED.svg?style=for-the-badge&logo=docker&logoColor=white) | Containers for deploying SonarQube, Nexus, and monitoring stack |
| ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=gradle&logoColor=white) | Builds and tests the Spring Boot application |
| ![Nexus](https://img.shields.io/badge/Nexus%20Repository-0E1E25.svg?style=for-the-badge&logo=sonatype&logoColor=white) | Hosts Docker images and build artifacts |
| ![SonarQube](https://img.shields.io/badge/SonarQube-4E9BCD.svg?style=for-the-badge&logo=sonarqube&logoColor=white) | Scans for bugs, vulnerabilities, and code smells |
| ![Prometheus](https://img.shields.io/badge/Prometheus-E6522C.svg?style=for-the-badge&logo=prometheus&logoColor=white) | Metrics collection and alerting |
| ![Grafana](https://img.shields.io/badge/Grafana-F46800.svg?style=for-the-badge&logo=grafana&logoColor=white) | Visualizes system and app performance metrics |
| ![Vagrant](https://img.shields.io/badge/Vagrant-1563FF.svg?style=for-the-badge&logo=vagrant&logoColor=white) | Creates virtualized development environments |
| ![VirtualBox](https://img.shields.io/badge/VirtualBox-183A61.svg?style=for-the-badge&logo=virtualbox&logoColor=white) | Provides the virtualization layer for infrastructure |

---

## 🔄 DevOps Pipeline Steps

1. **Provision Dev Environment** with Vagrant and VirtualBox using CentOS base image.
2. **Install & Configure Jenkins** to orchestrate the CI/CD pipeline.
3. **Set Up Docker** on the VM to run tools and services as containers.
4. **Deploy Nexus & SonarQube** in Docker for artifact and code quality management.
5. **Build & Analyze Code** using Gradle + SonarQube.
6. **Push Docker Images** to Nexus after successful builds.
7. **Automate Build & Deploy** using Jenkins integrated with Docker.
8. **Monitor System Metrics** using Prometheus and visualize them via Grafana dashboards.

---

## 📊 Monitoring Snapshot

> The system is continuously monitored through Grafana dashboards powered by Prometheus metrics, enabling rapid identification of performance bottlenecks or infrastructure issues.
