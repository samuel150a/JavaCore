<!doctype html>
<html lang="en" data-bs-theme="dark"> <!-- Enables Bootstrap dark theme -->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">

    <style>
        body {
            background-color: #121212;
            color: #f8f9fa;
            padding: 2rem;
            text-align: center;
        }

        h1 {
            margin-bottom: 2rem;
        }

        button {
            background-color: #0d6efd;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
        }

        button a {
            color: white;
            text-decoration: none;
        }

        button:hover {
            background-color: #0b5ed7;
        }
    </style>
</head>
<body>
<h1>WELCOME TO LOGIN APPLICATION</h1>
<form action="login" method="post">
    <input type="text" placeholder="user name" name="userName" required><br><br>
    <input type="email" placeholder="user email" name="userEmail" required><br><br>
    <input type="password" placeholder="user password" name="userPassword" required ><br><br>
    <input type="submit" value="login" class="btn btn-primary">
    <input type="reset" value="clear" class="btn btn-warning">

</form>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js" integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D" crossorigin="anonymous"></script>
</body>
</html>
