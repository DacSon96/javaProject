<%--
  Created by IntelliJ IDEA.
  User: ducon
  Date: 10/8/2021
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row mt-3" style="min-height: 80%">
        <div class="col-10">
            <div class="card">
                <div class="card-header">
                    <div class="row">
                        <div class="col">
                            <h5 class="mt-2">student List</h5>
                        </div>
                        <div class="col">
                            <button type="button" class="btn btn-outline-primary float-end">
                                <a href="/student/add.jsp" style="text-decoration: none">
                                    Create
                                </a>
                            </button>
                        </div>
                    </div>
                </div>
                <div class="card-body">
                    <form method="post" >
                        <div class="mb-3">
                            <label for="name" class="form-label">Student Name</label>
                            <input type="text" name="name" class="form-control" id="name" value="${student.name}">
                        </div>
                        <div class="mb-3">
                            <label for="birth" class="form-label">Day of Birth</label>
                            <input type="text" name="birth" class="form-control" id="birth" value="${student.birth}">
                        </div>
                        <div class="mb-3">
                            <label for="address" class="form-label">Address</label>
                            <input type="text" name="address" class="form-control" id="address" value="${student.address}">
                        </div>
                        <div class="mb-3">
                            <label for="phoneNumber" class="form-label">PhoneNumber</label>
                            <input type="text" name="phoneNumber" class="form-control" id="phoneNumber" value="${student.color}">
                        </div>
                        <div class="mb-3">
                            <label for="email" class="form-label">Email</label>
                            <input type="text" name="email" class="form-control" id="email" value="${student.email}">
                        </div>
                        <div class="mb-3">
                            <label for="classRoomId" class="form-label">ClassRoomId</label>
                            <input type="text" name="classRoomId" class="form-control" id="classRoomId" value="${student.classRoomId}">
                        </div>

                        <button type="submit" class="btn btn-primary mt-3">Edit</button>
                        <button class="btn btn-secondary mt-3"><a href="/student/student.jsp"></a>Back</button>
                    </form>
                </div>
                <div class="card-footer">
                </div>
            </div>
        </div>

    </div>
    <footer class="d-flex flex-wrap justify-content-between align-items-center py-2 my-3 border-top">
        <p class="col-md-4 mb-0 text-muted">© 2021 Company, Inc</p>
        <ul class="nav col-md-4 justify-content-end">
            <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Home</a></li>
            <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">About</a></li>
        </ul>
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
            crossorigin="anonymous"></script>
</div>
</body>
</html>
