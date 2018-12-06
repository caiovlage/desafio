<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shop Desafio</title>

    <!-- Bootstrap core CSS -->
    <link href="site/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="site/css/shop-homepage.css" rel="stylesheet">

  </head>
  <body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">Desafio</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      </div>
    </nav>

    <!-- Page Content -->
    <div class="container">
      <div class="row">
        <div class="col-lg-3">
          <h1 class="my-4">Categorias</h1>
          <div class="list-group">
          <a href="?categoria=" class="list-group-item">Todos</a>
          <c:forEach var="c" items="${categorias}">
          <a href="?categoria=${c}" class="list-group-item">${c}</a>
          </c:forEach>
          </div>
        </div>
        <!-- /.col-lg-3 -->
        <div class="col-lg-9">

          <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
            <ol class="carousel-indicators">
              <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
              <div class="carousel-item active">
                <img class="d-block img-fluid" src="site/img/webdoor.png" alt="First slide">
              </div>
              <br/>

          <div class="row">
			<c:forEach var="p" items="${produtos}">
			<div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="detalheProduto?id=${p.idProduto}" align="middle"><img  class="card-img-top" style="vertical-align:middle!important; width:auto!important; height: 144px!important;" src="<c:out value="${p.foto}"/>" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="#"><c:out value="${p.titulo}"/></a>
                  </h4>
                  <h5>R$${p.preco}</h5>
                  <p class="card-text">${p.descricao}</p>
                </div>
                <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>
			</c:forEach>
          </div>
          <!-- /.row -->
        </div>
        <!-- /.col-lg-9 -->
      </div>
      <!-- /.row -->
    </div>
    <!-- /.container -->
</div>
</div>
    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Desafio 2018</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="site/vendor/jquery/jquery.min.js"></script>
    <script src="site/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  </body>

</html>
