
<%@page import="Modelo.Solicitud"%>
<%@page import="ModeloDAO.SolicitudDAO"%>
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
              SolicitudDAO dao=new SolicitudDAO();
              int id=Integer.parseInt((String)request.getAttribute("codsol"));
              Solicitud sol=(Solicitud)dao.list(id);
          %>
            <h1>Modificar Persona</h1>
            <form action="Controlador_Sol">
                    Codigo Asociado: <br>
                    <input class="form-control" type="text" name="txtcod" value="<%= sol.getCod() %>"><br>
                    Cuotas: <br>
                    <input class="form-control" type="text" name="txtCuo" value="<%= sol.getCuotas() %>"><br>
                    Monto: <br>
                    <input class="form-control" type="text" name="txtMon" value="<%= sol.getMonto() %>"><br>
                    Fecha: <br>
                    <input class="form-control" type="text" name="txtFecha" value="<%= sol.getFecha() %>"><br>
                    Motivo: <br>
                    <input class="form-control" type="text" name="txtMot" value="<%= sol.getMotivo() %>"><br>
                    Taza: <br>
                    <input class="form-control" type="text" name="txtTaza" value="<%= sol.getTaza() %>"><br>
                    Estado: <br>
                    <input class="form-control" type="text" name="txtEstado" value="<%= sol.getEstado() %>"><br>
                
                    <input type="hidden" name="txtid" value="<%= sol.getId() %>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controlador_Sol?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
