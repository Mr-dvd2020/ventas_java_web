<%-- 
    Document   : Principal
    Created on : 27-abr-2021, 16:52:33
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/hetml; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- barra de naveg --%>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                  <a style="margin-left: 10px; border: none" class="btn btn-outline-light"  href="#">Home</a>
                </li>
                <li class="nav-item">
                  <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Producto&accion=Listar" target="myFrame">Productos</a>
                </li>
                <li class="nav-item">
                  <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Empleado&accion=Listar" target="myFrame">Empleados</a>
                </li>
                <li class="nav-item">
                  <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Cliente&accion=Listar" target="myFrame">Clientes</a>
                </li>
                <li class="nav-item">
                  <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=NuevaVenta" target="myFrame">Nueva venta</a>
                </li>
            </ul>
              <%-- lista desplegable --%>
              <div style="text-align: right;width:800px">
                <div class="dropdown">
                    <button style="border:none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      ${usuario.getNomb()}
                    </button>
                    <div class="dropdown-menu" style="position: absolute; top: 40px; left: 630px; width: 180px; height: 200px; background-color: yellow;" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="#">
                            <img src="img/usuario.png" alt="60" width="60"/>
                        </a>
                        <a class="dropdown-item" href="#">${usuario.getUser()}</a>
                        <a class="dropdown-item" href="#">usuario@gmail.com</a>
                        <div class="dropdown-divider"></div>
                        <form action="Validar" method="POST">
                            <button name="accion" Value="Salir" class="dropdown-item" href="#">salir</button>
                        </form>
                    </div>
                </div>
            </div>
          </div>
        </nav>
        <div class="m-4" style="height: 550px;">
            <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
