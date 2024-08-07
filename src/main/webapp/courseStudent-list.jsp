<%--
  Created by IntelliJ IDEA.
  User: Ivan
  Date: 31.07.2024
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Person Management Application</title>
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
            <li><a href="<%=request.getContextPath()%>/list"
                   class="nav-link">Students</a></li>
        </ul>
    </nav>
</header>
<br>

<div class="row">

    <div class="container">
        <h3 class="text-center">List of CourseStudent</h3>
        <hr>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Course_Id</th>
                <th>Student_Id</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="courseStudent" items="${listCourseStudent}">

            <tr>
                <td><c:out value="${courseStudent.id}"/></td>
                <td><c:out value="${courseStudent.course_id}"/></td>
                <td><c:out value="${courseStudent.student_id}"/></td>
                </c:forEach>

            </tbody>

        </table>
    </div>
</div>
</body>
</html>
