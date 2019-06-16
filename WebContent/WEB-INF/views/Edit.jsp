<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Sucursal</title>
</head>
<body>

	<form:form action="${pageContext.request.contextPath}/SaveE" method="POST" modelAttribute="sucursalDTO">
		
		<form:input TYPE="Hidden" name="id" path="idSucursal"/>
		
		<label>Nombre de la sucursal: </label>
		<form:input type="text" name="nombreS" path="NombreS" /><br>
		<form:errors path="NombreS" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Hora de entrada: </label>
		<form:input type="Time" name="horaE" path="HoraE" /><br>
		<form:errors path="HoraE" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Hora de salida: </label>
		<form:input type="Time" name="horaS" path="HoraS" /><br>
		<form:errors path="HoraS" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ubicacion: </label>
		<form:input type="text" name="ubicacion" path="Ubicacion" /><br>
		<form:errors path="Ubicacion" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Numero de mesas: </label>
		<form:input type="Number" name="nMesas" path="nMesas" /><br>
		<form:errors path="nMesas" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Nombre Gerente: </label>
		<form:input type="text" name="nomGerente" path="nomGerente" /><br>
		<form:errors path="nomGerente" cssStyle="color:#E81505;"></form:errors><br>
		
		
		
		<input type="submit" value="Modificar Sucursal">
	</form:form>

</body>
</html>