<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Empleado</title>
</head>
<body>

<form:form action="${pageContext.request.contextPath}/SaveAE" method="POST" modelAttribute="empleadoDTO2">
		
		<form:input TYPE="Hidden" name="id" path="idEmpleado"/>
		
		<label>Nombre del Empleado: </label>
		<form:input type="text" name="nombreE" path="NombreE" /><br>
		<form:errors path="NombreE" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Edad del empleado: </label>
		<form:input type="Number" name="edad" path="Edad" /><br>
		<form:errors path="Edad" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Genero del empleado</label><br>
		<form:radiobutton name="gender" path="genero" value="Masculino" required="required"/><label>Masculino</label><br>
		<form:radiobutton name="gender" path="genero" value="Femenino" required="required"/><label>Femenino</label><br>
		
		<label>Estado del empleado</label><br>
		<form:radiobutton name="status" path="estado" value="Activo" required="required"/><label>Activo</label><br>
		<form:radiobutton name="status" path="estado" value="No Activo" required="required"/><label>No Activo</label><br>
		
		<form:input TYPE="Hidden" name="id2" path="idSucursal"/>
		
		<br>
		<input type="submit" value="Agregar Usuario">
	</form:form>


</body>
</html>