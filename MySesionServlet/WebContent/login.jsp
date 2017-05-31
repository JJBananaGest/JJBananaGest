<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="head.jsp"></jsp:include>
<%
	String mierror = (String)request.getAttribute("mierror");
	String errorclass = mierror!=null?"has-error":"";
%>
<body>
	
	<jsp:include page="header.jsp"></jsp:include>
	
	<!-- Esto es un comentario -->
	<%-- Esto es un comentario oculto en el HTML --%>
	
	
	<c:if test="${not empty mierror}">
		<div class="alert-danger" id="errores_login">${mierror}</div>
	</c:if>
	
	<form action="login" method="post" accept-charset="utf-8" class="formulario">
		<div>LogIn</div>
		<input type="email" name="email" placeholder="Your email" class="<%=errorclass%>">
		<input type="password" name="password" placeholder="Your password" class="<%=errorclass%>">
		<button>Send</button>
	</form>
	
	<jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>