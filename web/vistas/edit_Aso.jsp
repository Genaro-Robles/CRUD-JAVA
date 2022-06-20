
<%@page import="Modelo.Asociado"%>
<%@page import="ModeloDAO.AsociadoDAO"%>
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
              AsociadoDAO dao=new AsociadoDAO();
              int id=Integer.parseInt((String)request.getAttribute("codaso"));
              Asociado aso=(Asociado)dao.list(id);
          %>
            <h1>Modificar Persona</h1>
            <form action="Controlador_A">
                Nombre: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= aso.getNombre()%>"><br>
                    Apellidos: <br>
                    <input class="form-control" type="text" name="txtApe" value="<%= aso.getApellidos()%>"><br>
                    Estado: <br>
                    <input class="form-control" type="text" name="txtEst" value="<%= aso.getEstado()%>"><br>
                    Eps: <br>
                    <input class="form-control" type="text" name="txtEps" value="<%= aso.getEps()%>"><br>
                    Dni: <br>
                    <input class="form-control" type="text" name="txtDni" value="<%= aso.getDni()%>"><br>
                    Aportes: <br>
                    <input class="form-control" type="text" name="txtApo" value="<%= aso.getAportes()%>"><br>
                    Nivel de Estudios: <br>
                    <input class="form-control" type="text" name="txtNiv" value="<%= aso.getNivel()%>"><br>
                    Salario: <br>
                    <input class="form-control" type="text" name="txtSal" value="<%= aso.getSalario()%>"><br>
                    Numero de Hijos <br>
                    <input class="form-control" type="text" name="txtNhi" value="<%= aso.getNhijos()%>"><br>
                    Telefono: <br>
                    <input class="form-control" type="text" name="txtTel" value="<%= aso.getTelefono()%>"><br>
                    Direccion: <br>
                    <input class="form-control" type="text" name="txtDir" value="<%= aso.getDireccion()%>"><br>
                
                <input type="hidden" name="txtid" value="<%= aso.getCodigo()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controlador_A?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
