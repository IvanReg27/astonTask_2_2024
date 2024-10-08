# astonTask_02_2024

Task:

1)  Make REST Service using JDBC and Servlet;
2)  CRUD service that has the following features:

- Course
-----------------------------------------
Identifier
Title
List of students (ManyToMany)

- Student
-----------------------------------------
Identifier
Name
Coordinator
Course list (ManyToMany)

- Coordinator
-----------------------------------------
Identifier
Name
Student list (OneToMany)

3) Not permitted to use Spring, Hibernate;
4) Must be implemented not lazy communications OneToMany, ManyToMany;
5) Servlet must accept and return DTO (do not return Entity);
6) Must be unit tests, use Mockito and Junit;
7) Use integration testing with testcontainers to test the DB-based repository (DAO) (make sure that the connection in the tests is to the testcontainer, not to the main SUBD);
8)  The coating of tests should be more than 80%;
9)  Postgres DBMS;
10)  Lombok and SonarLint are recommended;
11)  Don’t forget about interfaces, javadki, logins;
12)  For the injection of password and logon use the piercing;
13)  The delivery of Z through sending in personal message in Telegram link to pull request from GitHub.
