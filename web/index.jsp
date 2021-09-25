<%-- 
    Document   : Principal
    Created on : 27-abr-2021, 16:52:33
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/hetml; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- contenedores --%>
        <div class="container mt-5 col-lg-5">
            <div class="card col-sm-100">
                <div class="card body text-center">
                    <%-- formulario --%>
                    <form class="form-sign" action="Validar" method="POST">
                        <div class="form-group">
                            <h3>Iniciar sesion</h3>
                            <img src="img/Logo.png" alt="70" width="170"/>
                            <label>Bienvenidos al Sistema</label>
                        </div>
                        <div class="form-group">
                            <label>Usuario:</label>
                            <input type="text" name="txtuser" class="from-control">
                        </div>
                        <div class="form-group">
                            <label>Contraseña:</label>
                            <input type="password" name="txtpass" class="from-control">
                        </div>
                        <%-- boton que realizara la accion --%>
                        <input type="Submit" name="accion" value="Ingresar" class="btn btn-primary btn-b">
                    </form>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>              
    </body>
</html>
