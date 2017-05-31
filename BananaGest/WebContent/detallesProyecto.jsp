<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
							<div class="col-xs-4 col-sm-6 col-md-2">Descripción</div>
							<div class="col-xs-4 col-sm-6 col-md-2 fecha">Fecha inicio</div>
							<div class="col-xs-4 col-sm-6 col-md-2">Responsable</div>
							<div class="col-xs-0 col-sm-6 col-md-2"></div>
						</div>
						<div class="fila-tabla  row" id="1">
							<div class="col-xs-4 col-sm-6 col-md-2"></div>
							<div class="col-xs-4 col-sm-6 col-md-2">ibermatica</div>
							<div class="col-xs-4 col-sm-6 col-md-2">proyecto pymes</div>
							<div class="col-xs-4 col-sm-6 col-md-2">15-10-2020</div>
							<div class="col-xs-4 col-sm-6 col-md-2" id="1r">Gloria
								Fernandez</div>
							<div class="col-xs-4 col-sm-6 col-md-2"></div>
							<div class="col-xs-0 col-sm-6 col-md-2"></div>
						</div>
						<div class="fila-tabla  row" id="2">
							<div class="col-xs-4 col-sm-6 col-md-2"></div>
							<div class="col-xs-4 col-sm-6 col-md-2">ibermatica</div>
							<div class="col-xs-4 col-sm-6 col-md-2">proyecto pymes</div>
							<div class="col-xs-4 col-sm-6 col-md-2">15-10-2020</div>
							<div class="col-xs-4 col-sm-6 col-md-2" id="2r">Gloria
								Fernandez</div>
							<div class="col-xs-4 col-sm-6 col-md-2"></div>

							<div class="col-xs-0 col-sm-6 col-md-2"></div>
						</div>
						<div class="fila-tabla  row" id="3">
							<div class="col-xs-4 col-sm-6 col-md-2"></div>
							<div class="col-xs-4 col-sm-6 col-md-2">ibermatica</div>
							<div class="col-xs-4 col-sm-6 col-md-2">proyecto pymes</div>
							<div class="col-xs-4 col-sm-6 col-md-2">15-10-2020</div>
							<div class="col-xs-4 col-sm-6 col-md-2" id="3r">Gloria
								Fernandez</div>
							<div class="col-xs-4 col-sm-6 col-md-2"></div>
							<div class="col-xs-0 col-sm-6 col-md-2"></div>
						</div>
					</div>
				</section>
			</div>
			<div class="col-xs-12 col-sm-3 col-md-3 aside">
				<aside>
					<div class="fila-tabla row">
						<div class="col-xs-4 col-sm-6 col-md-12 bca">Informacion
							Importante</div>
					</div>

				</aside>
			</div>
		</div>
	</div>
	<div class="tabla">
		<div class="fila-tabla row">
			<div class="col-xs-4 col-sm-6 col-md-12 bct2">Tareas</div>
		</div>
		<div class="cabecera-tabla row">
			<div class="col-xs-4 col-sm-6 col-md-2">Descripción</div>
			<div class="col-xs-4 col-sm-6 col-md-1">Notas</div>
			<div class="col-xs-4 col-sm-6 col-md-1">Adjuntos</div>
			<div class="col-xs-4 col-sm-6 col-md-1 fecha">Fecha ini</div>
			<div class="col-xs-4 col-sm-6 col-md-1 fecha">Fecha fin</div>
			<div class="col-xs-4 col-sm-6 col-md-2">Responsable</div>
			<div class="col-xs-4 col-sm-6 col-md-1">Estado</div>
		</div>
		<div class="fila-tabla  row" id="1">
			<div class="col-xs-4 col-sm-6 col-md-2">Esta tarea tiene el
				objetivo final de..</div>
			<div class="col-xs-4 col-sm-6 col-md-1">Hay que acabar de hacer
				el calendario..</div>
			<div class="col-xs-4 col-sm-6 col-md-1">Imagen003.jpg,
				audio.mp3..</div>
			<div class="col-xs-4 col-sm-6 col-md-1">21/01/2014</div>
			<div class="col-xs-4 col-sm-6 col-md-1">13/05/2017</div>
			<div class="col-xs-4 col-sm-6 col-md-2" id="1r">Paquita</div>
			<div class="col-xs-4 col-sm-6 col-md-1">Abierto</div>
		</div>

	</div>
	<div class="fila-tabla  row" id="2">
		<div class="col-xs-4 col-sm-6 col-md-2">Esta tarea tiene el
			objetivo final de..</div>
		<div class="col-xs-4 col-sm-6 col-md-1">Hay que acabar de hacer
			el calendario..</div>
		<div class="col-xs-4 col-sm-6 col-md-1">Imagen003, audio.mp3..</div>
		<div class="col-xs-4 col-sm-6 col-md-1">21/01/2014</div>
		<div class="col-xs-4 col-sm-6 col-md-1">13/05/2017</div>
		<div class="col-xs-4 col-sm-6 col-md-2" id="2r">Paquita</div>
		<div class="col-xs-4 col-sm-6 col-md-1">Abierto</div>
		<div class="col-xs-4 col-sm-6 col-md-3">
		</div>
	</div>

	<div class="fila-tabla  row" id="3">
		<div class="col-xs-4 col-sm-6 col-md-2">Esta tarea tiene el
			objetivo final de..</div>
		<div class="col-xs-4 col-sm-6 col-md-1">Hay que acabar de hacer
			el calendario..</div>
		<div class="col-xs-4 col-sm-6 col-md-1">Imagen003, audio.mp3.</div>
		<div class="col-xs-4 col-sm-6 col-md-1">21/01/2014</div>
		<div class="col-xs-4 col-sm-6 col-md-1">13/05/2017</div>
		<div class="col-xs-4 col-sm-6 col-md-2" id='3r'>Paquita</div>
		<div class="col-xs-4 col-sm-6 col-md-1">Abierto</div>
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