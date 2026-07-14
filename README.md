# Spring Boot JWT Authentication & Security

![Spring Boot](https://img.shields.io/badge/SpringBoot-4.1.0-green)
![JWT](https://img.shields.io/badge/Auth-JWT-blue)
![Security](https://img.shields.io/badge/Security-SpringSecurity-red)
![ModelMapper](https://img.shields.io/badge/Mapper-ModelMapper-orange)

A Spring Boot application demonstrating secure authentication and authorization using **Spring Security** and **JWT (JSON Web Tokens)**. This project follows a layered architecture and showcases modern Spring Boot development practices, including DTOs, ModelMapper, JPA repositories, and service-based business logic.

---

## 🚀 Features
- 🔐 **[JWT Authentication](ca://s?q=Spring_Boot_JWT_authentication)** – Stateless login and authorization.
- 👤 **[UserDetailsService](ca://s?q=Spring_Boot_UserDetailsService)** – Custom user authentication.
- 🛡 **[Spring Security Configuration](ca://s?q=Spring_Boot_Security_configuration)** – Role-based access control.
- 🔑 **[Password Encryption](ca://s?q=Spring_Boot_BCrypt_password_encryption)** – Secure password storage with BCrypt.
- 📦 **[DTO Pattern](ca://s?q=Spring_Boot_DTOs_and_entities)** – Clean API contracts.
- 🔄 **[ModelMapper](ca://s?q=Spring_Boot_ModelMapper)** – Entity ↔ DTO mapping.
- 🗄 **[Spring Data JPA](ca://s?q=Spring_Boot_repositories)** – Repository abstraction for persistence.
- ⚙ **[Service Layer](ca://s?q=Spring_Boot_services)** – Encapsulated business logic.
- 🌐 **[REST API](ca://s?q=Spring_Boot_REST_API)** – Secure endpoints for authentication and data access.
- 🗃 **[H2 Database](ca://s?q=Spring_Boot_H2_database)** – In-memory database for testing.
- 🎨 **[Thymeleaf Integration](ca://s?q=Spring_Boot_Thymeleaf)** – Simple UI templates secured with Spring Security.

---

## 🛠 Technologies Used

| Technology | Purpose |
|------------|---------|
| Java 17 | Programming Language |
| Spring Boot | Application Framework |
| Spring Security | Authentication & Authorization |
| JWT (JJWT) | Stateless Authentication |
| Spring Data JPA | Database Access |
| Hibernate | ORM |
| ModelMapper | Entity ↔ DTO Mapping |
| H2 Database | In-Memory Database |
| Lombok | Boilerplate Code Reduction |
| Maven | Dependency Management |
| Thymeleaf | Server-Side Templating |

---

## 📁 Project Structure
```text src └── main ├── java │ └── com.tony.security │ ├── config │ │ └── Security Configuration │ ├── controller │ ├── dto │ ├── entity │ ├── repository │ ├── security │ │ ├── JWT Filter │ │ ├── JWT Utility │ │ └── Authentication Components │ ├── service │ └── SecurityApplication.java └── resources ``` ---


---

## 🔑 Security Features

### [JWT Authentication](ca://s?q=Spring_Boot_JWT_authentication)
- User login with username & password
- JWT generation after successful authentication
- Token validation for protected endpoints
- Stateless session management

### [Spring Security](ca://s?q=Spring_Boot_Security_configuration)
- Custom `SecurityFilterChain`
- Password hashing with BCrypt
- Authentication Manager configuration
- Role-based access control
- Protected API endpoints

### [User Authentication](ca://s?q=Spring_Boot_UserDetailsService)
- Custom `UserDetailsService` implementation
- User lookup from database
- Secure login process

---

## 📦 Design Patterns Used
- **[DTO Pattern](ca://s?q=Spring_Boot_DTOs_and_entities)** – Prevents exposing entities directly, ensures clean API responses.
- **[Repository Pattern](ca://s?q=Spring_Boot_repositories)** – Abstracts database access with Spring Data JPA.
- **[Service Layer](ca://s?q=Spring_Boot_services)** – Encapsulates business logic for clean architecture.
- **Entity Mapping** – JPA entities with Hibernate ORM for persistence.
- **[ModelMapper](ca://s?q=Spring_Boot_ModelMapper)** – Automatic DTO ↔ Entity conversion.

---

## 🧪 Skills Demonstrated
- Spring Boot Development
- Spring Security & JWT
- Authentication & Authorization
- UserDetailsService Implementation
- SecurityFilterChain Configuration
- Password Encryption (BCrypt)
- REST API Development
- Spring Data JPA & Hibernate
- Entity Relationships
- DTO Design Pattern
- ModelMapper Integration
- Repository & Service Layer Architecture
- H2 Database Configuration
- Maven Project Management

---

## ▶ Getting Started

Clone the repository:
```bash
git clone https://github.com/antony-kuria/security.git
cd security
Run the application: ```bash ./mvnw spring-boot:run ``` Or on Windows: ```cmd mvnw.cmd spring-boot:run ``` --- ## 💾 Database The project uses an **H2 in-memory database** for development and testing. Features include: - User persistence - Spring Data JPA integration - Hibernate ORM - Easy testing without external database setup --- ## 🎯 Learning Objectives This project demonstrates my ability to: - Build secure Spring Boot applications. - Implement JWT-based authentication and authorization. - Configure Spring Security for stateless authentication. - Develop RESTful APIs using a layered architecture. - Apply DTO and ModelMapper for clean data transfer. - Design JPA entities and repositories. - Implement business logic using service classes. - Follow clean code and separation of concerns principles. --- ## 📜 License This project was developed for educational and portfolio purposes to demonstrate Java Spring Boot and Spring Security development skills.
