<%--
  Created by IntelliJ IDEA.
  User: ducon
  Date: 10/8/2021
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        input {
            margin-left: 200px;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
            integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js"
            integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/"
            crossorigin="anonymous"></script>

    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h1> Create new Product</h1><br><br>

<form action="/products" method="post">
    <table>
        <tr>
            <td><label for="name">ProductName:</label></td>
            <td><input id="name" type="text" name="name"></td>
            <br>
        </tr>
        <tr>
            <td><label for="price">Price:</label></td>
            <td><input id="price" type="text" name="price"></td>
        </tr>
        <tr>
            <td><label for="quantity">Quantity:</label></td>
            <td><input id="quantity" type="text" name="quantity"></td>
        </tr>
        <td><label for="color">Color:</label></td>
        <td><input id="color" type="text" name="color"></td>
        </tr>
        <tr>
            <td><label for="description">Description:</label></td>
            <td><input id="description" type="text" name="description"></td>
        </tr>
        <tr>
            <td><label for="category">Category:</label></td>
            <td><select name="category_id" id="category">
                <c:forEach items="${category}" var="category">
                <option value="${category.id}">${category.name}</option>
                </c:forEach>
            </select></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Submit" >
        </tr>
    </table>
</form>


</table>
</body>
</html>
