
index.jsp
879 B
<%-- 
    Document   : index
    Created on : 18/04/2025, 5:51:22 p. m.
    Author     : TOSHIBA
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del usuario</h1>
        <<form action="SvDatosprueba"method="post">
            <p><label>Documento</label><input type="text"name="documento"></p>
            <p><label>Nombre</label><input type="text"name="Nombre"></p>
            <p><label>Apellido</label><input type="text"name="Apellido"></p>
            <p><label>Telefono</label><input type="text"name="Telefono"></p>
            <p><label>correo</label><input type="text"name="correo"></p>
            <button type="submit">Enviar</button>
        </form>>
    </body>
</html>