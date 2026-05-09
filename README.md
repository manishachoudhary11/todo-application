# ToDo Application

A simple and responsive ToDo web application built using Java, Spring Boot, Spring Data JPA, Thymeleaf, and MySQL/H2 database.  
This project allows users to create, update, toggle, and delete daily tasks efficiently.

---

## Features

- Add new tasks
- Delete tasks
- Toggle task completion status
- View all tasks
- Simple and clean UI
- Backend built with Spring Boot
- MVC architecture implementation

---

## Tech Stack

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- HTML
- CSS
- Maven

---

## Project Structure

```bash
src
 ├── controller
 ├── service
 ├── repository
 ├── models
 └── templates
```

---


---

## How to Run the Project

### Clone Repository

```bash
git clone https://github.com/manishachoudhary11/todo-application.git
```

### Open Project

Open the project in IntelliJ IDEA or any Java IDE.

### Run Application

Run the main class:

```java
Application.java
```

### Open Browser

```bash
http://localhost:8080
```

---

## Functionalities

### Add Task
Users can add new tasks using the input field.

### Delete Task
Users can delete tasks permanently.

### Toggle Task
Users can mark tasks as completed/incomplete.

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | / | Get all tasks |
| POST | / | Create new task |
| GET | /{id}/delete | Delete task |
| GET | /{id}/toggle | Toggle task status |

---

## Author

Manisha Choudhary

---

## Future Improvements

- Add authentication/login system
- Add due dates
- Add task priorities
- Improve UI design
- Deploy application online

---


