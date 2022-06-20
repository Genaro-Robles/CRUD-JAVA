
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Pagina Principal</title>
    </head>
    <body>
        <!-- Barra de navegacion oscura -->
        <nav class="navbar navbar-inverse">
            <!-- Opcion inicial de la barra de navegacion -->
            <a class="navbar-brand" href="#">TFinal</a>
            <!-- Lista de elementos en el navegador -->
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Inicio</a></li>
                <li class="dropdown"><!-- es una lista tipo combobox -->
                    <a data-toggle="dropdown" href="#">Menus</a>
                    <ul class="dropdown-menu"><!-- Menu dentro del dropdown Mantenimiento -->
                        <!-- La opcion igual a 1 equivale igual a realizar un listado de una tabla -->
                        <li><a href="Controlador_A?accion=listar">Asociados</a></li>
                        <li><a href="Controlador_Sol?accion=listar">Solicitud de Credito</a></li>
                        <li><a href="Controlador_Sop?accion=listar">Soportes</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
    </body>
</html>
