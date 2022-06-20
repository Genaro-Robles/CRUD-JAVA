<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Solicitud"%>
<%@page import="java.util.List"%>
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
        <nav class="navbar navbar-inverse">
            <a class="navbar-brand" href="index.jsp">Inicio</a>
            <ul class="nav navbar-nav">
                <button class="btn btn-danger navbar-btn" onclick="Controlador?accion=add">
                    <a href="Controlador_Sol?accion=add">
                    Nueva Solicitud de Credito
                    </a>
                </button>
                <button class="btn btn-danger navbar-btn" onclick="">
                    <a href="#">
                    Reporte Grafico
                    </a>
                </button>
            </ul>
        </nav>
        <div class="container">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">Id</th>
                        <th class="text-center">Codigo Aso</th>
                        <th class="text-center">Cuotas</th>
                        <th class="text-center">Monto</th>
                        <th class="text-center">Fecha</th>
                        <th class="text-center">Motivo</th>
                        <th class="text-center">Taza</th>
                        <th class="text-center">Estado</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    SolicitudDAO dao=new SolicitudDAO();
                    List<Solicitud>list=dao.listar();
                    Iterator<Solicitud>iter=list.iterator();
                    Solicitud sol=null;
                    while(iter.hasNext()){
                        sol=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= sol.getId() %></td>
                        <td class="text-center"><%= sol.getCod() %></td>
                        <td class="text-center"><%= sol.getCuotas() %></td>
                        <td class="text-center"><%= sol.getMonto() %></td>
                        <td class="text-center"><%= sol.getFecha() %></td>
                        <td class="text-center"><%= sol.getMotivo() %></td>
                        <td class="text-center"><%= sol.getTaza() %>%</td>
                        <td class="text-center"><%= sol.getEstado() %></td>                       
                        <td class="text-center">
                            <a class="btn btn-warning bi bi-archive-fill" href="Controlador_Cuo?accion=listar&id=<%= sol.getId() %>"></a>
                            <a class="btn btn-warning bi bi-pencil-fill" href="Controlador_Sol?accion=editar&id=<%= sol.getId() %>"></a>
                            <a class="btn btn-danger bi bi-trash-fill" href="Controlador_Sol?accion=eliminar&id=<%= sol.getId() %>&"></a>
                        </td>
                    </tr>
                    <%}%> 
                    
                </tbody>
            </table>
        </div>
    </body>
</html>
