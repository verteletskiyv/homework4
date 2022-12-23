<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Something went wrong...</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"/>
</head>
<body style="background-image: linear-gradient(to right top,#d16ba5, #d288be, #d4a4d2, #d9bde1, #e1d6ec, #e2def2, #e4e6f6, #e8edf9, #d7e9fb, #c2e6fa, #aae4f5, #94e2e9);">
<div class="container p-3 text-center">
    <img class="img-fluid mt-5" style="width: 20%" src="https://cdn-icons-png.flaticon.com/512/682/682010.png"
         alt="error">
    <h1 class="display-3 mt-2">Something went wrong...</h1>
    <p class="display-6 mb-5 text-muted">${status}: ${error}</p>
    <a class="btn btn-light" href="/welcome">Home Page</a>
</div>
</body>
</html>
