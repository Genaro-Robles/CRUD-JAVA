
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Asociado"%>
<%@page import="java.util.List"%>
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
        <nav class="navbar navbar-inverse">
            <a class="navbar-brand" href="index.jsp">Inicio</a>
            <ul class="nav navbar-nav">
                <button class="btn btn-danger navbar-btn" onclick="Controlador?accion=add">
                    <a href="Controlador_A?accion=add">
                    Nuevo Asociado
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
                        <th class="text-center">Apellidos</th>
                        <th class="text-center">Estado</th>
                        <th class="text-center">EPS</th>
                        <th class="text-center">Dni</th>
                        <th class="text-center">Aportes</th>
                        <th class="text-center">Nivel de Estudio</th>
                        <th class="text-center">Salario</th>
                        <th class="text-center">#Hijos</th>
                        <th class="text-center">Telefono</th>
                        <th class="text-center">Direccion</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    AsociadoDAO dao=new AsociadoDAO();
                    List<Asociado>list=dao.listar();
                    Iterator<Asociado>iter=list.iterator();
                    Asociado aso=null;
                    while(iter.hasNext()){
                        aso=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= aso.getCodigo()%></td>
                        <td class="text-center"><%= aso.getNombre()%></td>
                        <td class="text-center"><%= aso.getApellidos()%></td>
                        <td class="text-center"><%= aso.getEstado()%></td>
                        <td class="text-center"><%= aso.getEps()%></td>
                        <td class="text-center"><%= aso.getDni()%></td>
                        <td class="text-center"><%= aso.getAportes()%></td>
                        <td class="text-center"><%= aso.getNivel()%></td>
                        <td class="text-center"><%= aso.getSalario()%></td>
                        <td class="text-center"><%= aso.getNhijos()%></td>
                        <td class="text-center"><%= aso.getTelefono()%></td>
                        <td class="text-center"><%= aso.getDireccion()%></td>                        
                        <td class="text-center">
                            <a class="btn btn-warning bi bi-pencil-fill" href="Controlador_A?accion=editar&cod=<%= aso.getCodigo()%>"></a>
                            <a class="btn btn-danger bi bi-trash-fill" href="Controlador_A?accion=eliminar&cod=<%= aso.getCodigo()%>"></a>
                        </td>
                    </tr>
                    <%}%> 
                    
                </tbody>
            </table>
        </div>
    </body>
</html>
