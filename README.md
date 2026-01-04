# Online Book Store – Spring Boot Project

This is an Online Book Store application built using Spring Boot and MySQL.
The project provides REST APIs and a simple web interface to manage books.

## Features
- Add new books
- View all books
- Update book details
- Delete books
- Store data in MySQL
- View books in browser

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Thymeleaf
- Maven

## Book Fields
- Book Name
- Author
- Publisher
- Price

## API Endpoints
- POST `/api/books` – Add book
- GET `/api/books` – View all books
- PUT `/api/books/{id}` – Update book
- DELETE `/api/books/{id}` – Delete book

## How to Run
1. Clone the repository
2. Open in Spring Tool Suite / Eclipse
3. Update MySQL credentials in `application.properties`
4. Run as Spring Boot App
5. Open browser: `http://localhost:8082/books`

## Author
Asif Mohammed
