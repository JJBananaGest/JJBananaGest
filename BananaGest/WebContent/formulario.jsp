<jsp:include page="head.jsp"></jsp:include>

<body>
	<header>

		<div class="container-fluid">

			<div class="row">

				<div class="col-xs-12 col-md-8 titulo">
					<h1>Banana Gest</h1>
				</div>

				<div class="col-xs-12 col-md-4 login">
					<div id="errores"></div>
				</div>
			</div>
		</div>
	</header>

	<div class="container-fluid">

		<div class="row central">

			<div class="col-xs-12 col-sm-9 col-md-9 section extra">

				<section>

					<form id="formulario" class="form-inline" method="POST" novalidate>
						<div>
							Nombre<label for="nombre">Nombre</label><input id="nombre"
								class="fi" type="text" placeholder="Tu nombre"
								pattern="[a-zA-Z]*" required
								aria-label="Aqu� va el nombre de usuario"></input>
						</div>
						<div>
							Correo electr�nico<label for="email">Correo electr�nico</label><input
								id="email" class="fi" type="email"
								placeholder="Tu direcci�n de correo" required
								aria-label="Aqu� va el correo electr�nico"></input>
						</div>
						<div>
							Contrase�a<label for="password">Contrase�aa</label><input
								id="password" class="fi" type="password"
								placeholder="Tu contrase�a" required
								aria-label="Aqu� se introduce la contrase�a"></input>
						</div>
						<div>
							Presentaci�n<label for="presentacion">Presentacion</label><input
								id="presentacion" class="fi" type="textarea"
								placeholder="Escribe tu presentaci�n" required
								aria-label="Aqu� se escribe la presentaci�n"></input>
						</div>
						<div>
							Foto de perfil<label for="foto">Foto de perfil</label><input
								id="foto" type="file"
								pattern="([a-zA-Z0-9\s_\\.\-:])+(.png|.jpg|.gif)$"
								aria-label="Aqu� se adjunta la foto de perfil"></input>
						</div>
						<div>
							Video de presentaci�n<label for="video">Video de
								presentaci�n</label><input id="video" type="file"
								pattern="([a-zA-Z0-9\s_\\.\-:])+(.avi|.mpg|.mp4)$"
								aria-label="Aqu� se adjunta el video de presentaci�n"></input>
						</div>
					</form>
					<button id="bc" class="crearusuario"
						aria-label="Este bot�n sirve para crear el usuario">Alta</button>
					<button class="volver2"
						aria-label="Este bot�n dirige a la p�gina anterior">Volver</button>
				</section>
			</div>
			<div class="col-xs-12 col-sm-3 col-md-3">
				<aside>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. In
						quis illum est deleniti ea molestias excepturi labore delectus
						harum cupiditate a ex nobis obcaecati quibusdam unde quaerat,
						dolor pariatur! Qui!</p>
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
<script src="scripts/validausuario.js"></script>
</html>