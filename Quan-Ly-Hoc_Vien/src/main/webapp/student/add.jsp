<%--
  Created by IntelliJ IDEA.
  User: ducon
  Date: 10/8/2021
  Time: 8:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
</head>
<body>
<div class="card-body">
    <form action="/student?action=add" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Student Name</label>
            <input type="text" name="name" class="form-control" id="name">
        </div>
        <div class="mb-3">
            <label for="birth" class="form-label">DateOfBirth</label>
            <input type="text" name="birth" class="form-control" id="birth">
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Address</label>
            <input type="text" name="address" class="form-control" id="address">
        </div>
        <div class="mb-3">
            <label for="phoneNumber" class="form-label">PhoneNumber</label>
            <input type="text" name="phoneNumber" class="form-control" id="phoneNumber">
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="text" name="email" class="form-control" id="email">
        </div><div class="mb-3">
            <label for="classRoomId" class="form-label">ClassRoomId</label>
            <input type="text" name="classRoomId" class="form-control" id="classRoomId">
        </div>

        <button type="submit" class="btn btn-primary mt-3">Create</button>
        <button class="btn btn-secondary mt-3"><a href="/student/student.jsp"></a>Back</button>
    </form>

</div>
</body>
</html>
