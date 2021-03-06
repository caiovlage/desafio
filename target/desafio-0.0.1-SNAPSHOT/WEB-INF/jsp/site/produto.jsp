<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>admin</title>
<!-- Bootstrap core CSS-->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">

<!-- Page level plugin CSS-->
<link href="vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin.css" rel="stylesheet">

</head>
<body id="page-top">

	<nav class="navbar navbar-expand navbar-dark bg-dark static-top">

		<a class="navbar-brand mr-1" href="index.html">Admin Desafio</a>

		<button class="btn btn-link btn-sm text-white order-1 order-sm-0"
			id="sidebarToggle" href="#">
			<i class="fas fa-bars"></i>
		</button>
	</nav>
	<div id="wrapper">
		<!-- Sidebar -->
		<ul class="sidebar navbar-nav">
			<li class="nav-item"><a class="nav-link" href="home"> <i
					class="fa fa-list"></i> <span>Produtos Vendidos</span></a></li>
			<li class="nav-item"><a class="nav-link" href="produto"> <i
					class="fab fa-product-hunt"></i> <span>Produtos</span>
			</a></li>
		</ul>
		<div id="content-wrapper">
			<div class="container-fluid">
				<!-- Breadcrumbs-->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Home</a></li>
					<li class="breadcrumb-item active">Cadastrar Produtos</li>
				</ol>
				<c:if test="${success == true}">
					<div class="alert alert-success" role="alert">Produto Salvo
						com Sucesso!</div>
				</c:if>

				<!-- DataTables Example -->
				<form:form method="post" id="form" action="addProduto">
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<div class="form-label-group">
									<form:input path="titulo" required="required" cssClass="form-control" />
									<label for="firstName">T�tulo</label>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-label-group">
									<form:input id="preco"  path="precoAux" required="required" cssClass="form-control" />
									<label for="preco">Pre�o</label>
								</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<form:input path="categoria" required="required" cssClass="form-control" />
							<label for="categoria">Categoria</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<form:input path="foto" required="required" cssClass="form-control" />
							<label for="Foto">Link da foto</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<form:input path="descricao" required="required" cssClass="form-control" />
							<label for="descricao">Descri��o</label>
						</div>
					</div>
					<div class="col-md-2">
						<div class="form-group">
							<input type="submit" value="Salvar"
								class="btn btn-primary btn-block" />
						</div>
					</div>
				</form:form>
			</div>
			<!-- /.container-fluid -->
			<!-- Sticky Footer -->
			<footer class="sticky-footer">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright � Desafio 2018</span>
					</div>
				</div>
			</footer>
		</div>
		<!-- /.content-wrapper -->
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Page level plugin JavaScript-->
	<script src="vendor/chart.js/Chart.min.js"></script>
	<script src="js/jquery.maskMoney.min.js"></script>
	<script src="vendor/datatables/jquery.dataTables.js"></script>
	<script src="vendor/datatables/dataTables.bootstrap4.js"></script>
	
	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin.min.js"></script>
	<script src="js/jquery-validate.js"></script>

<script type="text/javascript">
	
    $(document).ready(function(){
    	$("#form").validate();
    	$('#preco').maskMoney();
    	
    });
</script>

</body>

</html>
