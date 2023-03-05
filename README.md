# Spring Boot To-Do List API
This project is a simple RESTful API for managing a to-do list. It was built using the Spring Boot framework and uses an H2 in-memory database for data storage.

#Getting Started
To run this project locally, you'll need to have the following installed:

Java 11 or later
Maven

You can run the project using the following command:

mvn spring-boot:run

Once the application is running, you can access the API using the following URL:

http://localhost:8080

#Endpoints
The following endpoints are available in the API:

GET /todos: Retrieves a list of all todos in the database.
GET /todos/{id}: Retrieves a specific todo by ID.
POST /todos: Adds a new todo to the database.
PUT /todos/{id}: Updates an existing todo in the database.
DELETE /todos/{id}: Deletes a todo from the database.
#Data Model
The API uses a simple data model consisting of a Todo object with the following fields:

id (long): The ID of the todo.
title (String): The title of the todo.
description (String): A description of the todo.
completed (boolean): Whether or not the todo is completed.
Database
The API uses an H2 in-memory database for data storage. The database schema is automatically created based on the schema.sql file in the src/main/resources folder. Sample data is added to the database using the data.sql file.

#Testing
You can test the API using a tool like Postman or by running automated tests using JUnit. Automated tests are located in the src/test/java folder.

#Conclusion
This project demonstrates a simple implementation of a RESTful API for managing a to-do list using Spring Boot. The code is open-source and can be modified to suit your needs. If you have any questions or issues with the project, feel free to open an issue on the GitHub repository.
