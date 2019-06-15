<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test</title>
</head>
<body>
<div style="background:purple; width:35%; margin-left: auto; margin-right: auto">

 <table border="1"  style="background:cyan; margin-left: auto; margin-right: auto">
       <tr>
           <th>Nombre</th>
           <th>Contraseña</th>
           
       </tr>
       
    
       <c:forEach items="${usuario}" var="usuario">
         <tr>
           <th>${usuario.nombreU}</th>
           <th>${usuario.clave}</th>
        
           
       </tr>
       </c:forEach>
       
  </table>
<br>
<table border="1"  style="background:cyan; margin-left: auto; margin-right: auto">
       <tr>
           <th>Nombre</th>
           <th>Entrada</th>
           <th>Salida</th>
           <th>Ubicacion</th>
           <th>Mesas</th>
           <th>Nombre Gerente</th>
           
       </tr>
       
    
       <c:forEach items="${sucursal}" var="sucursal">
         <tr>
           <th>${sucursal.nombreS}</th>
           <th>${sucursal.newHour}</th>
           <th>${sucursal.newHour2}</th>
           <th>${sucursal.ubicacion}</th>
           <th>${sucursal.nMesas}</th>
           <th>${sucursal.nomGerente}</th>
        
           
       </tr>
       </c:forEach>
       

  </table>
  <br>
<br>
  <table border="1"  style="background:cyan; margin-left: auto; margin-right: auto">
       <tr>
           <th>Nombre</th>
           <th>Edad</th>
           <th>Genero</th>
           <th>Estado</th>
           <th>Sucursal</th>
     
       </tr>
       
    
       <c:forEach items="${empleado}" var="empleado">
         <tr>
           <th>${empleado.nombreE}</th>
           <th>${empleado.edad}</th>
           <th>${empleado.genero}</th>
           <th>${empleado.estadoE}</th>
           <th>${empleado.sucursal.nombreS}</th>
        
           
       </tr>
       </c:forEach>
       
  </table>

</div>
</body>
</html>