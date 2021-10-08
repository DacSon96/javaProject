<%--
  Created by IntelliJ IDEA.
  User: ducon
  Date: 10/8/2021
  Time: 6:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">

</head>
<body>
<div>
    <div class="col-12">
        <div class="card">
            <div class="card-header">
                <div class="row">
                    <div class="col">
                        <button type="button" class="btn btn-outline-primary">
                            <a href="/student/add.jsp" style="text-decoration: none">
                                Add
                            </a>
                        </button>
                    </div>
                    <div class="col">
                        <form style="float: right">
                            <div class="row">
                                <div class="col">
                                    <input class="form-control" style="size: 200px" type="text" placeholder="Search" aria-label="Search" name="search">
                                </div>
                                <div class="col">
                                    <button type="submit" class="btn btn-outline-primary">Search</button>
                                </div>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
    <table class="table table-success table-striped">
        <thead>
        <tr>
            <th scope="col"class="col-1">#</th>
            <th scope="col" class="col-1">Name</th>
            <th scope="col" class="col-2">Date of Birth</th>
            <th scope="col" class="col-4">Email</th>
            <th scope="col" class="col-2">Address</th>
            <th scope="col" class="col-2">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${studentList}" var="student">
        <tr>
            <th scope="row">${student.id}</th>
            <td>${student.name}</td>
            <td>${student.birth}</td>
            <td>${student.email}</td>
            <td>@${student.address}</td>
            <td><button type="button" class="btn btn-warning" ><a style="color: black" href="/student?action=update&id=${student.id}">Edit</a></button>
                <button type="button" class="btn btn-danger"><a style="color: white" href="/student?action=delete&id=${student.id}">Delete</a></button></td>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
    </div>
</div>
</body>

</html>
