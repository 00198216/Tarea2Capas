<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main page</title>
</head>
<body>
<body >

<br>
<table border="1" >
       <tr>
           <th>Nombre</th>
           <th>Entrada</th>
           <th>Salida</th>
           <th>Ubicacion</th>
           <th>Mesas</th>
           <th>Nombre Gerente</th>
           
       </tr>
       
    
       
         <tr>
           <th>${sucursal.nombreS}</th>
           <th>${sucursal.newHour}</th>
           <th>${sucursal.newHour2}</th>
           <th>${sucursal.ubicacion}</th>
           <th>${sucursal.nMesas}</th>
           <th>${sucursal.nomGerente}</th>
           
         
           
       </tr>
       

  </table>
  <br>
  
  <br>
<table border="1" >
       <tr>
           <th>Nombre</th>
           <th>Edad</th>
           <th>Genero</th>
           <th>Estado</th>
           
           
       </tr>
       
    
       <c:forEach items="${empleado}" var="empleado">
         <tr>
           <th>${empleado.nombreE}</th>
           <th>${empleado.edad}</th>
           <th>${empleado.genderE}</th>
           <th>${empleado.estadoE}</th>
         
           
       </tr>
       </c:forEach>
       </table>
       
       <br>
       
       <form  name="back" action="${pageContext.request.contextPath}/Return" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${sucursal.idSucursal}>
            <INPUT TYPE="Submit" VALUE="Return">
        </form>

</body>
</html>