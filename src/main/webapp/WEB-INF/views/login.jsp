<%@ page contentType="text/html; UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"/>
</head>


<body style="background-image: linear-gradient(to right top,#d16ba5, #d288be, #d4a4d2, #d9bde1, #e1d6ec, #e2def2, #e4e6f6, #e8edf9, #d7e9fb, #c2e6fa, #aae4f5, #94e2e9);">
<div class="container-fluid" style="width: 400px">
    <p class="h1 text-center text-muted mb-5" style="margin-top: 140px">Authorization</p>
    <form method="post" class="login-form">
        <div class="form-floating mb-3">
            <input type="text" id="login" name="login" placeholder="Login" class="form-control">
            <label for="login">Login</label>
        </div>
        <div class="form-floating mb-4">
            <input type="password" id="pass" name="password" placeholder="Password" class="form-control">
            <label for="pass">Password</label>
        </div>
        <div class="d-grid gap-2 col-6 mx-auto">
            <button type="submit" class="btn btn-light mt-2">Sign In</button>
        </div>
        <c:if test="${not empty errorMsg}">
            <div class="alert alert-danger d-flex align-items-center alert-dismissible fade show hiding mt-3"
                 role="alert">
                    ${errorMsg}
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
        </c:if>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>