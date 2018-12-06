<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop Desafio</title>

<!-- Bootstrap core CSS -->
<link href="site/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="site/css/shop-homepage.css" rel="stylesheet">

</head>
<body>

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="#">Desafio</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
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
					<a href="/desafio?categoria=" class="list-group-item">Todos</a>
					<c:forEach var="c" items="${categorias}">
						<a href="/desafio?categoria=${c}" class="list-group-item">${c}</a>
					</c:forEach>
				</div>
			</div>
			<!-- /.col-lg-3 -->
			
			<div class="col-lg-9">

				<div id="carouselExampleIndicators" class="carousel slide my-4"
					data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#carouselExampleIndicators" data-slide-to="0"
							class="active"></li>
					</ol>
					<div class="carousel-inner" role="listbox">
						<div class="carousel-item active">
							<img class="d-block img-fluid" src="site/img/webdoor.png"
								alt="First slide">
						</div>
						<br />
						<div class="row">
							<div class="col-lg-5">
								<a href="#"><img
									style="border-style: inset !important; width: auto !important; height: 300px !important;"
									src="<c:out value="${produto.foto}"/>" alt=""></a>
							</div>
							<div class="col-lg-6">
								<p><h2>${produto.titulo}</h2></p>
								<p>${produto.descricao}</p>						
				  				<p>R$:${produto.preco}</p>
				  				<p><a href="finalizarPedido?id=${produto.idProduto}" class="btn btn-primary">comprar</a></p>
				  			</div>
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
