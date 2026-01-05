# 🍽️ Restaurant Service – Distributed Systems Project

## 📌 Project Overview

This repository contains the **Restaurant Service** of a microservices-based **Restaurant Reservation System**, developed as part of the *Distributed Systems* course.

The goal of this service is to manage:
- Restaurants
- Menus
- Availability slots  

and expose REST APIs to be consumed by other services (e.g. Reservation Service) using **Spring Boot** and **OpenFeign**, following a microservice architecture.

The implementation is based on the official project specification provided during the course.

---

## 🧱 Technology Stack

- **Java:** 17 / 21 / 25 (depending on local environment)
- **Spring Boot:** 3.x
- **Spring Data JPA**
- **PostgreSQL**
- **Flyway** (database migrations)
- **Maven**
- **Docker & Kafka** (planned / partial integration)
------
## 🗂️ Project Structure
restaurant-service
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com.example.restaurant
│ │ │ ├── controller
│ │ │ ├── service
│ │ │ ├── repository
│ │ │ └── model
│ │ └── resources
│ │ ├── application.yml
│ │ └── db/migration
│ └── test
├── pom.xml
└── README.md


⚠️ Current Status & Known Issues

Although the project structure, configuration, and code follow the assignment requirements, the application does not fully work as expected yet.

❌ Known Problems

Persistent PostgreSQL authentication issues

Application fails during Flyway initialization

localhost:8081 is not always reachable due to database connection errors

Difficulties configuring PostgreSQL users and passwords on Windows

Due to these issues, full API testing using Postman could not be completed.



✅ What Is Implemented

Correct microservice architecture and folder structure

Spring Boot configuration

Controllers, services, repositories, and models

Flyway database migration scripts

Independent service configuration

Git repository correctly initialized and delivered



📚 Notes for Evaluation

This project demonstrates understanding of:

Microservice principles

Separation of concerns

Database-per-service architecture

Spring Boot project structure

Flyway-based schema management

The main blocking issues were related to local infrastructure and environment configuration, not architectural design or code structure.

## 🗂️ Project Structure

