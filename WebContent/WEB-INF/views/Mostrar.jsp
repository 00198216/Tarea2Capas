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
<title>Sucursales</title>
</head>
<body style="background:linear-gradient(to right, darkblue ,cyan)">

<center>

<div class="jumbotron jumbotron-fluid" style="background:#FAFAFA90">
  <div class="container">
    <h1 class="display-4">Sucursales</h1>
  </div>
</div>
<br>
<div>
   <form  name="add" action="${pageContext.request.contextPath}/Add" method="post">
            <INPUT TYPE="Submit"  class="button buttonAdd" VALUE="Agregar Sucursal">
           </form>
   </div>
   </center>
   
<br>
<br>
<br>
<div style="background:white">
<table border="1">
    
       <c:forEach items="${sucursal}" var="sucursal">
         <tr>
           <th>${sucursal.nombreS}</th>
    
           
           <th><form  name="form1" action="${pageContext.request.contextPath}/Perfil" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${sucursal.idSucursal}>
            <INPUT TYPE="Submit"  class="button2 buttonPer" VALUE="Ver Perfil">
           </form></th>
           
           <th><form  name="form2" action="${pageContext.request.contextPath}/Edit" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${sucursal.idSucursal}>
            <INPUT TYPE="Submit" class="button2 buttonEdit" VALUE="Editar">
           </form></th>
           
           <th><form  name="form3" action="${pageContext.request.contextPath}/Delete" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${sucursal.idSucursal}>
            <INPUT TYPE="Submit" class="button2 buttonErase" VALUE="Borrar">
           </form></th>
        
           
       </tr>
       </c:forEach>
       

  </table>
  </div>
  



</body>
</html>