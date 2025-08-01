<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Piano</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-expand-lg bg-warning">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Casio-Pianos</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Piano.jsp">SubmitDetails</a>
                </li>




            </ul>
            </li>

            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>


        </div>
    </div>
</nav>
<div align="center">

    <form action="Piano" method="get">
        Search ID:<input type="text" placeholder="enter id" name="id"><br><br>


        <input type="submit" class="btn btn-primary" value="Search"><br><br>
    </form>
    <br>
    <span style="color:red;">${failure}</span>
    <br><br>
    <p>CustomberName: ${dto.customberName}</p>
    <p>ModelName: ${dto.modelName}</p>
    <p>NoOfKeys: ${dto.noOfKeys}</p>
    <p>Price: ${dto.price}</p>
    <p>MemberShip: ${dto.memberShip}</p>
    <p>Manufactured By: ${dto.manufactured}</p>
</div>
</body>
</html>