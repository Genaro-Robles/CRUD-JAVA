
<%@page import="Modelo.Soportes"%>
<%@page import="ModeloDAO.SoportesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
              <%
              SoportesDAO dao=new SoportesDAO();
              int id=Integer.parseInt((String)request.getAttribute("codsop"));
              Soportes sop=(Soportes)dao.list(id);
          %>
            <h1>Modificar Persona</h1>
            <form action="Controlador_Sop">
                    Titulo: <br>
                    <input class="form-control" type="text" name="txtNom" value="<%= sop.getNombre()%>"><br>
                    Contenido: <br>
                    <input class="form-control" type="textarea" name="txtCont" value="<%= sop.getContenido() %>"><br>
                    Nº Solicitud <br>
                    <input class="form-control" type="text" name="txtSol" value="<%= sop.getSolicitud() %>"><br>
                
                <input type="hidden" name="txtcod" value="<%= sop.getCodigo()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controlador_Sop?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
