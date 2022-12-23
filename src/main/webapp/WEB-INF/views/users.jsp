<%@ page contentType="text/html; UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .table {
            position: absolute;
            top: 40%;
            left: 50%;
            margin-right: -50%;
            transform: translate(-50%, -50%);
            width: 35%;
            background-color: whitesmoke;
        }

        .table-curved {
            border-collapse: separate;
            border: solid #ccc 1px;
            border-radius: 6px;
            border-left: 0;
            border-top: 0;
        }

        .table-curved > thead:first-child > tr:first-child > th {
            border-bottom: 0;
            border-top: solid #ccc 1px;
        }

        .table-curved td, .table-curved th {
            border-left: 1px solid #ccc;
            border-top: 1px solid #ccc;
        }

        .table-curved > :first-child > :first-child > :first-child {
            border-radius: 6px 0 0 0;
        }

        .table-curved > :first-child > :first-child > :last-child {
            border-radius: 0 6px 0 0;
        }

        .table-curved > :last-child > :last-child > :first-child {
            border-radius: 0 0 0 6px;
        }

        .table-curved > :last-child > :last-child > :last-child {
            border-radius: 0 0 6px 0;
        }
    </style>
</head>


<body style="background-image: linear-gradient(to right top,#d16ba5, #d288be, #d4a4d2, #d9bde1, #e1d6ec, #e2def2, #e4e6f6, #e8edf9, #d7e9fb, #c2e6fa, #aae4f5, #94e2e9);">
<div class="container-fluid text-center" style="margin-top: 110px">
    <a href="${pageContext.request.contextPath}/welcome">
        <button type="submit" class="btn btn-block btn-light" style="width: 180px">Return</button>
    </a>
</div>
<table class="table table-hover table table-curved">
    <thead>
    <td><b>Login</b></td>
    <td><b>Name</b></td>
    </thead>
    <c:forEach var="user" items="${usersList}">
        <tr>
            <td class="bg-light">${user.login}</td>
            <td class="bg-light">${user.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>