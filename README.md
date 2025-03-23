# Employee Management System spring-boot-app #
* Built a web-based employee management system using Spring Boot for backend services.
* Developed features for adding, updating, deleting, and listing employees with a user-friendly UI.
* Integrated MySQL as the database and used Spring Data JPA for efficient data handling.
* Frontend Link : https://github.com/AyushmanD/Employee-Management-frontend-UI

## Probable Interview Questions ##
Q1. Can you explain your Employee management project ?
Answer:
* I built a web-based Employee Management System using Spring Boot for the backend.
* The system allows users to add, update, delete, and list employees.
* It features a user-friendly UI and integrates with a mysql database using Spring data Jpa.
* This project ensures efficient employee record management in an organization.

Q2. What functionalities did you implement in the system?
Answer:
The system provide functionalities such as 
* Add employee: To add a new employee with details such as employeeID, name, designation and salary.
* Update employee: To update the employee details.
* Delete employee: To delete the employee 
* List employee: To fetch and  show the employees

Q3. How did you design the database schema?
Answer:
* The database contains a single table with attributes such as employee id, employee name, employee designation, employee salary.
* Each attribute is mapped to the entity in spring boot using JPA annotation such @Entity , @Id for specifying primary key etc.

Q4. How did you handle validation for employee data?
Answer:
* I implemented a custom exception class to return meaningful error messages if the validation fails such as invalid employee details to fetch employees.

Q5. How did you integrate the frontend with the backend?
Answer:
* I expose RESTful endpoints in the backend and allow the frontend to communicate using API calls.
* A frontend was designed to send requests to the backend, the backend processed them and returned a response.

Q6. How did you test the employee management system?
Answer:
* Manual testing using Postman to send requests and check responses.
