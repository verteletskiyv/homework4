<%@ page contentType="text/html; UTF-8" %>
<html>
<head>
    <title>Welcome</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-image: linear-gradient(to right top,#d16ba5, #d288be, #d4a4d2, #d9bde1, #e1d6ec, #e2def2, #e4e6f6, #e8edf9, #d7e9fb, #c2e6fa, #aae4f5, #94e2e9);">
<div class="container-fluid text-center" style="width: 400px">
    <p class="h1 text-muted mb-5" style="margin-top: 100px">Welcome back, ${user.name}</p>
    <div class="btn-group" role="group" aria-label="g">
        <a href="${pageContext.request.contextPath}/users">
            <button type="submit" class="btn btn-light" style="margin-right: 15px">List of users</button>
        </a>
        <form method="post" action="${pageContext.request.contextPath}/logout">
            <button type="submit" class="btn btn-outline-danger">Log Out</button>
        </form>
    </div>
</div>
</body>
</html>