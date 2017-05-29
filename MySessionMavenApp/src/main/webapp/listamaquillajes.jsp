<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"></jsp:include>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	
	<section class="lista_maquillajes">
		<div>Hola ${idUsuario}<a href="logout"><button>SignOut</button></a></div>
		<h1>Lista de maquillajes de Miname</h1>

		<ul>
			<c:forEach var="maq" items="${listaMaquillajesAMostrar}" varStatus="counter">
				<li>
					<span>${maq.codigo}</span> -
					<span>${maq.marca}</span> -
					<span>${maq.tipo}</span> -
					<span>${maq.precio}€</span>
				</li>
			</c:forEach>
			
		</ul>

	</section>

	<jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>