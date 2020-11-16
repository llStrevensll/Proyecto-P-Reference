<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  <!--Encontado dentro de javaee-api-8.0 -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Personas</title>
    </head>
    <body>
        <h1>Listado de Personas!</h1>
        <ul>
            <c:forEach items="${personas}" var="persona">
                <li>${persona.nombre} ${persona.apellido}</li>
            </c:forEach>
        </ul>
    </body>
</html>
