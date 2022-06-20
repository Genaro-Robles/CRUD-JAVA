
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
                <h1>Agregar Asociado</h1>
                <form action="Controlador_A">
                    Nombre: <br>
                    <input class="form-control" type="text" name="txtNom"><br>
                    Apellidos: <br>
                    <input class="form-control" type="text" name="txtApe"><br>
                    Estado: <br>
                    <input class="form-control" type="text" name="txtEst"><br>
                    Eps: <br>
                    <input class="form-control" type="text" name="txtEps"><br>
                    Dni: <br>
                    <input class="form-control" type="text" name="txtDni"><br>
                    Aportes: <br>
                    <input class="form-control" type="text" name="txtApo"><br>
                    Nivel de Estudios: <br>
                    <input class="form-control" type="text" name="txtNiv"><br>
                    Salario: <br>
                    <input class="form-control" type="text" name="txtSal"><br>
                    Numero de Hijos <br>
                    <input class="form-control" type="text" name="txtNhi"><br>
                    Telefono: <br>
                    <input class="form-control" type="text" name="txtTel"><br>
                    Direccion: <br>
                    <input class="form-control" type="text" name="txtDir"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador_A?accion=listar">Regresar</a> <br> <br>
                </form>
            </div>

        </div>
    </body>
</html>
