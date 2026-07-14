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

## 🔑 Security Features

### JWT Authentication
- User authentication using username and password
- JWT generation after successful login
- JWT validation for protected endpoints
- Stateless authentication (no server-side session)

### Spring Security
- Custom `SecurityFilterChain`
- Password hashing with BCrypt
- Authentication Manager configuration
- Protected API endpoints
- Role-based authentication/authorization support

### User Authentication
- Custom `UserDetailsService`
- User lookup from the database
- Secure login process
- Authentication handled via Spring Security

---

## 📦 Design Patterns Used

### DTO Pattern
- Prevents exposing entities directly
- Keeps API responses clean and consistent
- Enables request/response validation at the API layer

### Repository Pattern
- Uses Spring Data JPA repositories for persistence
- Provides database abstraction
- Supports standard CRUD operations

### Service Layer
- Separates business logic from controllers
- Promotes clean architecture
- Keeps logic reusable and maintainable

### Entity Mapping
- JPA entities persisted with Hibernate ORM
- Defines database relationships and mappings

### ModelMapper
- Automatic Entity ↔ DTO conversion
- Cleaner controller/service code
- Reduced mapping boilerplate

---

## 🧪 Skills Demonstrated
- Spring Boot development
- Spring Security
- JWT authentication and authorization
- `UserDetailsService` implementation
- `SecurityFilterChain` configuration
- Password encryption (BCrypt)
- REST API development
- Spring Data JPA and Hibernate
- Entity relationships
- DTO design pattern
- ModelMapper usage
- Repository pattern and service-layer architecture
- Maven project management
- H2 database configuration

---

## ▶ Getting Started

### Clone the repository
```bash
git clone https://github.com/antony-kuria/security.git
```

### Navigate to the project directory:
```bash
cd security 
```
