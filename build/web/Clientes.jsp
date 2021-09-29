<%-- 
    Document   : Clientes
    Created on : 29-abr-2021, 14:32:32
    Author     : usuario
--%>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="conig.Conexion"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- contenedor --%>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=Cliente" method="POST">
                        <div class="form-group">
                            <div>Dni</div>
                            <input type="text" value="${cliente.getDni()}" name="txtDni" class="from-control" size=40 style="width:300px">
                        </div>
                        <div class="form-group">
                            <div>Nombres</div>
                            <input type="text" value="${cliente.getNomb()}" name="txtNombres" class="from-control" size=40 style="width:300px">
                        </div>
                        <div class="form-group">
                            <div>Direccion</div>
                            <input type="text" value="${cliente.getDirecc()}" name="txtDireccion" class="from-control" size=40 style="width:300px">
                        </div>
                        <div class="form-group">
                            <div>Estado</div>
                            <input type="text" value="${cliente.getEstad()}" name="txtEstado" class="from-control" size=40 style="width:300px">
                        </div>
                        <input type="Submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="Submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
            <%-- bcrear tabla --%>
            <div class="table col-sm-8">
                <table claas="table table-hover">
                    <thead>
                        <tr>
                            <th >ID</th>
                            <th>DNI</th>
                            <th >NOMBRES</th>
                            <th>DIRECCION</th>
                            <th>ESTADO</th>
                            <th>ACCIONES</th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="cl" items="${clientes}">
                            <tr>
                                <td>${cl.getId()}</td>
                                <td>${cl.getDni()}</td>
                                <td>${cl.getNomb()}</td>
                                <td>${cl.getDirecc()}</td>
                                <td>${cl.getEstad()}</td>
                               
                                <td>
                                    <a class="btn btn-outline-light" style="background-color: chartreuse;" href="Controlador?menu=Cliente&accion=Editar&id=${cl.getId()}">Editar</a>
                                    <a class="btn btn-danger" href="Controlador?menu=Cliente&accion=Eliminar&id=${cl.getId()}">Eliminar</a>
                                </td>
                                
                            </tr>
                        </c:forEach>
          
                        
                    
                        
                    </tbody>
                </table>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
