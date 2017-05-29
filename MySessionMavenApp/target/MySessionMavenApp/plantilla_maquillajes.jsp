<%@page import="com.netmind.models.Maquillaje"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"></jsp:include>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<%
		Maquillaje[] listaRecibida = (Maquillaje[])request.getAttribute("listaMaquillajesAMostrar");
	%>
	
	<section class="lista_maquillajes">

		<h1>Lista de maquillajes de Miname</h1>

		<ul>
			<% if(listaRecibida!=null) for(Maquillaje maq:listaRecibida) {%>
				<li>
					<span><%=maq.getCodigo() %></span>
					<span><%=maq.getMarca() %></span>
					<span><%=maq.getTipo() %></span>
					<span><%=maq.getPrecio() %></span>
				</li>
			<%} %>
		</ul>

	</section>

	<jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>