<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/index.css">
<title>BananaGest</title>
</head>
<body>
	<header>

		<div class="container-fluid">

			<div class="row">

				<div class="col-xs-12 col-md-8 titulo">
					<h1>Banana Gest</h1>
				</div>

				<div class="col-xs-12 col-md-4 login">
					<form class="form-inline" action="login" method="POST" novalidate>

						<div class="form-group">
							<label class="sr-only" for="email">Email</label> <input
								type="email" class="form-control" id="email" name="email"
								placeholder="Email" required
								aria-label="Aquí se introduce el email usado en la cuenta de usuario">
						</div>

						<div class="form-group">
							<label class="sr-only" for="password">Password</label> <input
								type="password" class="form-control" id="password"
								name="password" placeholder="Password" required
								aria-label="Aquí se introduce la contraseña">
						</div>

						<button id="btn_login" type="submit" class="btn btn-default"
							aria-label="Este botón sirve para entrar a la cuenta de usuario">Sign
							in</button>
						<div id="errores"></div>
						<div class="mierror"></div>
					</form>
				</div>
			</div>
		</div>
	</header>

	<div class="container-fluid">

		<div class="row">

			<div class="col-xs-12 col-sm-12 col-md-12 section">

				<section>

					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
						Consequuntur saepe soluta eum molestias ullam molestiae maxime
						quam assumenda, maiores illum necessitatibus obcaecati, tempore
						aperiam minima placeat veniam ab harum, ducimus.</p>
				</section>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
<script src="scripts/scripts/validacion.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="scripts/bootstrap/js/bootstrap.min.js"></script>
</html>