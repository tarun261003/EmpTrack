# EmpTrack - Employee Management System 🧑‍💼

**EmpTrack** is a Spring Boot-based web application that allows users to manage employee data using CRUD operations (Create, Read, Update, Delete). It uses **Thymeleaf** for templating and **Bootstrap** for UI styling.

---

## 📌 Features

- Create new employee entries
- View a list of all employees
- Update employee details
- Delete employees from the system
- Form validation and clean UI
- Thymeleaf + Bootstrap integration
- Internal CSS + redirect support via index.html

---

## 🛠️ Tech Stack

| Layer        | Tech                         |
|--------------|------------------------------|
| Backend      | Java 17, Spring Boot 3.5.3   |
| Frontend     | Thymeleaf, Bootstrap         |
| Database     | MySQL (JPA + Hibernate)      |
| Build Tool   | Maven                        |
| IDE Support  | Eclipse / IntelliJ           |

---

## 📁 Project Structure

├── src/
│ ├── main/
│ │ ├── java/ # Java source files
│ │ │ └── com/praccrud/
│ │ ├── resources/ # application.properties, etc.
│ │ └── webapp/
│ │ ├── index.html # Redirects to /employees
│ │ └── static/css # Internal Bootstrap or styles
├── target/ # Build artifacts (.jar)
├── pom.xml # Maven dependencies
└── README.md # This file



---

## 🚀 Getting Started (Run Locally)

### ✅ Prerequisites
- Java 17+
- Maven
- MySQL (optional for now)

### ✅ Build the Project

mvn clean package
✅ Run the App
java -jar target/EmpTrack-0.0.1-SNAPSHOT.jar
Then open your browser:
http://localhost:8080/

🖥️ Screens
/ – Auto-redirects to /employees

/employees – List of all employees

/employees/new – Form to add new employee

/employees/edit/{id} – Edit existing employee

⚙️ Configuration
In src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/empdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.thymeleaf.prefix=classpath:/templates/

