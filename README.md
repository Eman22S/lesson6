# 🦷 ADS Dental Surgeries Appointments Management System

This is a Spring Boot CLI application that manages appointments for dental surgeries. It demonstrates enterprise data persistence using **Spring Data JPA**, modeling real-world relationships between dentists, patients, surgeries, addresses, and appointments.

---

## 📦 Features

- Create and manage patients, dentists, and surgeries
- Schedule and view appointments
- One-to-one and many-to-one entity relationships
- Data seeding using `CommandLineRunner`
- Built with Spring Boot, JPA (Hibernate), and MySQL

---

## 🧱 Domain Model

Entities:

- `Address`
- `Patient`
- `Dentist`
- `Surgery`
- `Appointment`
- `User` and `Role` (for role-based access if needed in future)

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL 8.x
- Lombok

---

## 🚀 Getting Started

### 1. Clone the Repo

```bash
git clone https://github.com/your-username/ads-dental-cli-app.git
cd ads-dental-cli-app
