<%--
  Created by IntelliJ IDEA.
  User: Ivan
  Date: 31.07.2024
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Student Management Application</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark"
         style="background-color: #7d7d79">
        <div>
            <a href="https://github.com/IvanReg27" class="navbar-brand"> Java Rest API (Servlet+JDBC+PostgresSQL) </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/listCourse"
                   class="nav-link">Students</a></li>
        </ul>
    </nav>
</header>
<br>

<div class="row">

    <div class="container">
        <h3 class="text-center">List of Students</h3>
        <hr>
        <div class="container text-left">

            <a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
                New Student</a>
        </div>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Coordinator_id</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="student" items="${listStudent}">

                <tr>
                    <td><c:out value="${student.id}" /></td>
                    <td><c:out value="${student.name}" /></td>
                    <td><c:out value="${student.coordinator_id}" /></td>
                    <td><a href="edit?id=<c:out value='${student.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp; <a
                                href="delete?id=<c:out value='${student.id}' />">Delete</a></td>
                </tr>
            </c:forEach>

            </tbody>

        </table>
    </div>
</div>
</body>
</html>
