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
							<div class="col-xs-4 col-sm-6 col-md-3">Id</div>
							<div class="col-xs-4 col-sm-6 col-md-3">T�tulo</div>
							<div class="col-xs-4 col-sm-6 col-md-3">Fecha fin</div>
							<div class="col-xs-4 col-sm-6 col-md-3">Estado</div>
						</div>
						
						<c:set var = "finalizado" scope = "request" value = "Finalizado"/>
						
						
						<c:forEach var="x" items="${listaProyectosAMostrar}"
							varStatus="counter">
							<div class="fila-tabla  row" id="1">
								<c:if test= "${x.estado ne finalizado}"><div class="col-xs-4 col-sm-6 col-md-3">
									<span>${x.id}</span>
								</div>
								<div class="col-xs-4 col-sm-6 col-md-3">
									<a href="detalles?id=${x.id}"><span>${x.titulo}</span></a>
								</div>
								<div class="col-xs-4 col-sm-6 col-md-3">
									<span>${x.fechaF}</span>
								</div>
								<div class="col-xs-4 col-sm-6 col-md-3">
									<span>${x.estado}</span>
								</div>
								</c:if>
								<c:if test= "${x.estado eq finalizado}"><div class="col-xs-4 col-sm-6 col-md-3 acabado">
									<span>${x.id}</span>
								</div>
								<div class="col-xs-4 col-sm-6 col-md-3">
									<a href="detalles?id=${x.id}"><span>${x.titulo}</span></a>
								</div>
								<div class="col-xs-4 col-sm-6 col-md-3">
									<span>${x.fechaF}</span>
								</div>
								<div class="col-xs-4 col-sm-6 col-md-3">
									<span>${x.estado}</span>
								</div>
								</c:if>
							</div>
						</c:forEach>

					</div>
				</section>
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