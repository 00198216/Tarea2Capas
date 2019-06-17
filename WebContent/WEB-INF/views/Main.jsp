<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
  background-color: #E0F7FA70;
  
}

td, th {
  border: 1px solid #dddddd;
  text-align:center;
  padding: 8px;
   background-color: #E0F7FA70;
}

tr:nth-child(even) {
  background-color: #E0F7FA99;
}

.button {
  background-color: #4CAF50; 
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  -webkit-transition-duration: 0.4s; 
  transition-duration: 0.4s;
  cursor: pointer;
}

.button2 {
  background-color: #4CAF50; 
  border: none;
  color: white;
  padding: 8px 16px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 10px;
  margin: 4px 2px;
  -webkit-transition-duration: 0.4s; 
  transition-duration: 0.4s;
  cursor: pointer;
}

.buttonAdd {
  background-color: white; 
  color: black; 
  border-radius: 8px;
  border: 2px solid #008CBA;
}

.buttonAdd:hover {
  background-color: #1A237E;
  color: white;
}

.buttonPer {
  background-color: white; 
  color: black; 
  border-radius: 8px;
  border: 2px solid #AB47BC;
}

.buttonPer:hover {
  background-color: #4A148C;
  color: white;
}

.buttonEdit {
  background-color: white; 
  color: black; 
  border-radius: 8px;
  border: 2px solid #00E676;
}

.buttonEdit:hover {
  background-color: #00C853;
  color: white;
}

.buttonErase {
  background-color: white; 
  color: black; 
  border-radius: 8px;
  border: 2px solid #F44336;
}

.buttonErase:hover {
  background-color: #B71C1C;
  color: white;
}

button:hover {
  opacity: 0.7;
}


</style>
<meta charset="ISO-8859-1">
<title>Perfil</title>
</head>

<body style="background:linear-gradient(to right, darkblue ,cyan)">

<center>

<div class="jumbotron jumbotron-fluid" style="background:#FAFAFA90">
  <div class="container">
    <h1 class="display-4">${sucursal.nombreS}</h1>
  </div>
</div>
<br>
   </center>
   
<br>
<br>
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
            <th><form  name="edit" action="${pageContext.request.contextPath}/EditE" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${empleado.idEmpleado}>
            <INPUT TYPE="Submit"   class="button2 buttonPer" VALUE="Editar Empleado">
           </form></th>
           <th><form  name="Borrar" action="${pageContext.request.contextPath}/BorrarE" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${empleado.idEmpleado}>
            <INPUT TYPE="Submit" class="button2 buttonEdit" VALUE="Borrar Empleado">
           </form></th>
         
           
       </tr>
       </c:forEach>
       </table>
       
        <br>
        <center>
   <div>
     <form  name="add" action="${pageContext.request.contextPath}/AddE" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${sucursal.idSucursal}>
            <INPUT TYPE="Submit" class="button buttonAdd" VALUE="Agregar Empleado">
        </form>
         <br>
       
       <form  name="back" action="${pageContext.request.contextPath}/Return" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${sucursal.idSucursal}>
            <INPUT TYPE="Submit" class="button buttonErase" VALUE="Return">
        </form>
   </center>
       
        
       
      

</body>
</html>