<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="head.jsp"></jsp:include>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	<nav>
		<div class="row">
			<div id="erroresresp"></div>
			<div class="col-xs-3 anchop"></div>
		</div>
	</nav>
	<div class="container-fluid">
		<div class="row central">
			<div class="col-md-9 section">
				<section>
					<div class="tabla">
						<div class="fila-tabla row">
							<div class="col-xs-4 col-sm-6 col-md-12 bct">Proyecto</div>
						</div>
						<div class="cabecera-tabla row">
							<div class="col-xs-4 col-sm-6 col-md-2">Id</div>
							<div class="col-xs-4 col-sm-6 col-md-2">Título</div>
							<div class="col-xs-4 col-sm-6 col-md-2 fecha">Fecha fin</div>
							<div class="col-xs-4 col-sm-6 col-md-2">Estado</div>
						</div>

						<c:forEach var="x" items="${listaProyectosAMostrar}"
							varStatus="counter">
							<div class="fila-tabla  row" id="1">
								<div class="col-xs-4 col-sm-6 col-md-2">
									<span>${x.id}</span>
								</div>
								<div class="col-xs-4 col-sm-6 col-md-2">
									<a href="detalles"><span>${x.titulo}</span></a>
								</div>
								<div class="col-xs-4 col-sm-6 col-md-2">
									<span>${x.fechaF}</span>
								</div>
								<div class="col-xs-4 col-sm-6 col-md-2">
									<span>${x.estado}</span>
								</div>
							</div>
						</c:forEach>

					</div>
				</section>
			</div>
			<div class="col-xs-12 col-sm-3 col-md-4 aside">
				<aside>
					<div class="fila-tabla row">
						<div class="col-xs-4 col-sm-6 col-md-12 bca">Información
							Importante</div>
					</div>
				</aside>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="scripts/bootstrap/js/bootstrap.min.js"></script>
<script src="scripts/funciones.js"></script>
<script src="scripts/validate.js"></script>
</html>