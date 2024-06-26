<%@page session="true"%>
<%@page errorPage="error.jsp"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--  Especifica el prefijo que se utilizar� para acceder a las etiquetas de la biblioteca importada. En este caso, el prefijo "c" se utilizar� para acceder a las etiquetas de JSTL Core en el archivo JSP. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- fmt: Este prefijo se utiliza para formatear y presentar datos, como fechas, n�meros y mensajes. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!-- fn: Este prefijo se utiliza para acceder a las funciones de utilidad proporcionadas por JSTL, como operaciones de cadena, colecci�n y manipulaci�n de fechas. -->

<!DOCTYPE html>
<html>
<head>
    <title>Alta de Alumno</title>
</head>
<body>
    <h2>Session ID: <%=request.getSession().getId()%></h2>
    
    <h2>Baja Alumno</h2>
    <form action="BorrarAlumnoServlet" method="post">
    	<select name="legajo">
    		<c:forEach items="${listaAlumnos}" var="alumno">
    			<option value="${alumno.legajo}">${alumno.legajo}</option>
    		</c:forEach>
    	</select><input type="submit" value="Borrar Alumno">
    </form>
    
	<c:if test="${not empty mensaje}">
    	<h3>${mensaje}</h3>
    </c:if>

    <hr>
    <h3><a href="index.jsp">Home</a></h3>
</body>
</html>
