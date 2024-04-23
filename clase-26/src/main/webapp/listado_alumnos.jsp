<%@ page session="true"%>
<%@ page errorPage="error.jsp"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--  Especifica el prefijo que se utilizará para acceder a las etiquetas de la biblioteca importada. En este caso, el prefijo "c" se utilizará para acceder a las etiquetas de JSTL Core en el archivo JSP. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- fmt: Este prefijo se utiliza para formatear y presentar datos, como fechas, números y mensajes. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!-- fn: Este prefijo se utiliza para acceder a las funciones de utilidad proporcionadas por JSTL, como operaciones de cadena, colección y manipulación de fechas. -->

<!DOCTYPE html>
<html>
<head>
    <title>Listado de Alumnos</title>
</head>
<body>
    <h4>Session ID: <%=request.getSession().getId()%></h4>
  
    <h2>Listado de Alumnos</h2>
    <table border="1">
        <tr>
            <th>Legajo</th>
            <th>Nombre</th>
            <th>Edad</th>
        </tr>
  
        <c:forEach items="${listaAlumnos}" var="alumno">  
			<tr>
                <td>${alumno.legajo}</td>
                <td>${alumno.nombre}</td>
                <td>${alumno.edad}</td>
			</tr>  
        </c:forEach>  
    </table>
    
	<hr>
    <h3><a href="alta_alumno.jsp">Alta Alumno</a></h3>
    <h3><a href="BorrarAlumnoServlet">Baja Alumno</a></h3><br>
    <hr>
    <h3><a href="LimpiarSesionServlet">Limpiar sesión</a></h3><br>
</body>
</html>
