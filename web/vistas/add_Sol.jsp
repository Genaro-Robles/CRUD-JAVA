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
                <h1>Agregar Solicitud</h1>
                <form action="Controlador_Sol">
                    Codigo Asociado: <br>
                    <input class="form-control" type="text" name="txtcod"><br>
                    Cuotas: <br>
                    <input class="form-control" type="text" name="txtCuo"><br>
                    Monto: <br>
                    <input class="form-control" type="text" name="txtMon"><br>
                    Fecha: <br>
                    <input class="form-control" type="text" name="txtFecha" placeholder="dd-mm-aaaa"><br>
                    Motivo: <br>
                    <input class="form-control" type="text" name="txtMot"><br>
                    Taza: <br>
                    <input class="form-control" type="text" name="txtTaza"><br>
                    Estado: <br>
                    <input class="form-control" type="text" name="txtEstado"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador_Sol?accion=listar">Regresar</a> <br> <br>
                </form>
            </div>

        </div>
    </body>
</html>

