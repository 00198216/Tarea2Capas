<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucursales</title>
</head>
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
       
    
       <c:forEach items="${sucursal}" var="sucursal">
         <tr>
           <th>${sucursal.nombreS}</th>
           <th>${sucursal.newHour}</th>
           <th>${sucursal.newHour2}</th>
           <th>${sucursal.ubicacion}</th>
           <th>${sucursal.nMesas}</th>
           <th>${sucursal.nomGerente}</th>
           
           <th><form  name="form1" action="${pageContext.request.contextPath}/Perfil" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${sucursal.idSucursal}>
            <INPUT TYPE="Submit" VALUE="Ver Perfil">
           </form></th>
           
           <th><form  name="form2" action="${pageContext.request.contextPath}/Edit" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${sucursal.idSucursal}>
            <INPUT TYPE="Submit" VALUE="Editar">
           </form></th>
           
           <th><form  name="form3" action="${pageContext.request.contextPath}/Delete" method="post">
            <INPUT TYPE="Hidden" NAME="id" value=${sucursal.idSucursal}>
            <INPUT TYPE="Submit" VALUE="Borrar">
           </form></th>
        
           
       </tr>
       </c:forEach>
       

  </table>
  <br>

</div>
</body>
</html>