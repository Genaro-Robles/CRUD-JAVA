<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Soportes"%>
<%@page import="java.util.List"%>
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
        <nav class="navbar navbar-inverse">
            <a class="navbar-brand" href="index.jsp">Inicio</a>
            <ul class="nav navbar-nav">
                <button class="btn btn-danger navbar-btn" onclick="Controlador?accion=add">
                    <a href="Controlador_Sop?accion=add">
                    Nueva Solicitud de Soporte
                    </a>
                </button>
                <button class="btn btn-danger navbar-btn" onclick="">
                    Reporte Grafico
                </button>
            </ul>
        </nav>
        <div class="container">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">Codigo</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Contenido</th>
                        <th class="text-center">Solicitud</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    SoportesDAO dao=new SoportesDAO();
                    List<Soportes>list=dao.listar();
                    Iterator<Soportes>iter=list.iterator();
                    Soportes sop=null;
                    while(iter.hasNext()){
                        sop=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= sop.getCodigo() %></td>
                        <td class="text-center"><%= sop.getNombre() %></td>
                        <td class="text-center"><%= sop.getContenido() %></td>
                        <td class="text-center"><%= sop.getSolicitud() %></td>
                        <td class="text-center">
                            <a class="btn btn-warning bi bi-pencil-fill" href="Controlador_Sop?accion=editar&cod=<%= sop.getCodigo() %>"></a>
                            <a class="btn btn-danger bi bi-trash-fill" href="Controlador_Sop?accion=eliminar&cod=<%= sop.getCodigo() %>"></a>
                        </td>
                    </tr>
                    <%}%> 
                    
                </tbody>
            </table>
        </div>
    </body>
</html>
