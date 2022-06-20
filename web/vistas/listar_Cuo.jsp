
<%@page import="Modelo.Solicitud"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cuotas"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.CuotasDAO"%>
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
                    <a href="Controlador_Sol?accion=listar">
                    Volver
                    </a>
                </button>
            </ul>
        </nav>
        <div class="container">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">Numero</th>
                        <th class="text-center">Saldo (S/.)</th>
                        <th class="text-center">Capital (S/.)</th>
                        <th class="text-center">Interes (S/.)</th>
                        <th class="text-center">Codigo de prestamo</th>
                    </tr>
                </thead>
                <%

                    int id=Integer.parseInt((String)request.getAttribute("codcuo"));
                    CuotasDAO dao=new CuotasDAO();
                    List<Cuotas>list=dao.listar(id);
                    Iterator<Cuotas>iter=list.iterator();
                    Cuotas cuo=null;
                    while(iter.hasNext()){
                        cuo=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= cuo.getNumero() %></td>
                        <td class="text-center"><%= cuo.getSaldo() %></td>
                        <td class="text-center"><%= cuo.getCapital() %></td>
                        <td class="text-center"><%= cuo.getInteres() %></td>
                        <td class="text-center"><%= cuo.getPrestamos() %></td>                    
                    </tr>
                    <% } %> 
                </tbody>
            </table>
        </div>
    </body>
</html>