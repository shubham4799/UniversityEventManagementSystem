# UNIVERSITY MANAGEMENT SYSTEM
## Requirments
    IntelliJIDEA
    Serverport: 8080 (use: localhost:8080)
    Java version: 17
    Everything is present in the pom.xml (no need to download any library)
## Data Flow
1.The user sends a request to the application through the API endpoints.

2.The API receives the request and sends it to the appropriate controller method.

3.The controller method makes a call to the method in service class.

4.The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class

5.The controller method returns a response to the API.

6.The API sends the response back to the user.
## Dependencies
### Validation
* Bean Validation with Hibernate validator.
### H2 Database
* Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.
### Spring Web
* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
### Spring Boot DevTools
* Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
### Spring Data JPA
* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
### Lombok
* Java annotation library which helps to reduce boilerplate code.
## End-points

### Add event in list
* "/uni/event/addEvent"
### Update event 
* "/uni/event/updateEvent/{eventId}/{eventName}"
### Delete event 
* "/uni/event/deleteEvent/{eventId}"
### Get event
* "/uni/event/getAllEvents"
### Add student in list
* /uni/student/addStudent
### Update student
* /uni/student/updateStudentDepartment/{studentId}/{department}
### delete Student
* /uni/student/deleteStudent/studentId/{studentId}

# Project Summary
  This is a project of university management system in this project we are performing crud 
operation on student and event model. 

    