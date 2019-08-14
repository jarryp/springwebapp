<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Administrador</h1>
	
	<c:out value="${ mensaje }" />
	
	<sf:form action="${pageContext.request.contextPath}/admin/save" method="post" commandName="admin">
	<input type="text" name="estado" id="estado">
	<table>
		<tr><td colspan="2" align="center">FORMULARIO</td></tr>
		<tr>
			<td>Nombre</td>
			<td> <sf:input path="nombre"/>  </td>
		</tr>
		<tr>
			<td>Cargo</td>
			<td> <sf:input path="cargo"/> </td>
		</tr>
		<tr>
			<td colspan="2" align="center"> <input type="submit" value="Guardar Registro" /> </td>
		</tr>
	</table>
	</sf:form>
	
	<br/>
	<c:out value="${ resultado }"  />
	
</body>
</html>