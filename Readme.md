# 🧑‍💻 User Management Web App

> SuperLabs Internship Assignment (2025) – Back-End Developer  
> **Author:** Satyam R Tiwari

---

## 📌 Project Overview

This is a full-stack web application built as part of the **SuperLabs Back-End Developer Internship Assignment 2025**.  
It allows users to **register**, **log in**, and **view their profile** using a clean UI and secure backend logic.

---

## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Thymeleaf**
- **MySQL**
- **HTML/CSS**
- **JavaScript**

---

## ✅ Features Implemented

### 🔐 User Registration & Login
- Users can register with:
  - Name
  - Email
  - Phone
  - Age
  - Username
  - Password
- Form validation on both frontend and backend.
- Passwords are securely stored.
- Login authentication with redirect to user profile.

### 👤 Profile Page
- Displays the latest registered user’s details.
- Uses Thymeleaf to render the data dynamically.
- Backend API used to populate the data on the page.

### 🔄 REST API Integration
- **API Endpoint:** `/api/users/latest`
- Returns the most recently registered user in JSON format.
- Can be tested using cURL or integrated with frontend JavaScript.

---

## 🌐 URLs for Testing

| Feature            | URL                                   |
|--------------------|----------------------------------------|
| Latest User API    | `http://localhost:8080/api/users/latest` |
| Login Page         | `http://localhost:8080/login`            |
| Registration Page  | `http://localhost:8080/register`         |
| User Profile Page  | `http://localhost:8080/profile`          |

---

## 🧪 Unit Testing

- Basic unit tests are written for service-layer logic using **JUnit**.
- Ensures business logic functions correctly for user registration and retrieval.

---

## 💽 Database Setup

- MySQL is used to persist user data.
- Update `application.properties` with your MySQL username/password and DB name:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
  spring.datasource.username=your_username
  spring.datasource.password=your_password
"# superlabs" 
