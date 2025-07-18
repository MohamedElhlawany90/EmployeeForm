
# 📝 Job Application API

This is a simple Spring Boot REST API that handles job application submissions. It provides endpoints to create, retrieve, update, and delete job application entries, with proper validation and structured error handling.

---

## 🚀 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL** (Managed via Workbench)
- **Lombok**
- **Jakarta Validation (Bean Validation)**
- **Postman** (for API testing)

---

## 📂 Project Structure

```
src/main/java/com/global/
├── controller/
│   └── EmpController.java
├── dto/
│   └── EmployeeDTO.java
├── entity/
│   └── Employee.java
├── service/
│   └── EmpService.java
├── exception/
│   ├── GlobalExceptionHandler.java
│   └── ResourceNotFoundException.java
```

---

## 📬 API Endpoints

| Method | Endpoint              | Description                      |
|--------|-----------------------|----------------------------------|
| GET    | `/api/employees`      | Get all employee applications    |
| GET    | `/api/employees/{id}` | Get a specific application by ID |
| POST   | `/api/employees`      | Submit a new application         |
| PUT    | `/api/employees/{id}` | Update an existing application   |
| DELETE | `/api/employees/{id}` | Delete an application            |

---

## ✅ Features

- Full CRUD operations
- Request validation using annotations (`@NotBlank`, `@Email`, `@Min`, etc.)
- Centralized exception handling
- Clean separation using DTOs (Data Transfer Objects)
- Uses Lombok to reduce boilerplate code

---

## 🛠 How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/yourusername/Job_Application.git
   ```

2. Set up MySQL and create a database (e.g., `job_application`).

3. Update `application.properties` with your DB credentials.

4. Run the application from your IDE or via:
   ```bash
   mvn spring-boot:run
   ```

---

## 🔍 Notes

- Swagger is not yet integrated.
- Resume files are represented by a URL (`resumeFileUrl`) field.
- Dates are stored using `LocalDate`.

---

## 📧 Contact

If you have any suggestions or questions, feel free to reach out.
