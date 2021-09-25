/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteBD;
import Modelo.Empleado;
import Modelo.EmpleadoBD;
import Modelo.Producto;
import Modelo.ProductoBD;
import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author usuario
 */
public class Controlador extends HttpServlet {

    Empleado em=new Empleado();
    EmpleadoBD embd=new EmpleadoBD();
    Cliente cl=new Cliente();
    ClienteBD clbd=new ClienteBD();
    Producto pr=new Producto();
    ProductoBD prbd=new ProductoBD();
    int idempleado;
    int idcliente;
    int idproducto;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String menu=request.getParameter("menu");
         String accion=request.getParameter("accion");
         if(menu.equals("Principal")){

             request.getRequestDispatcher("Principal.jsp").forward(request, response);
         }
         if(menu.equals("Empleado")){
             switch(accion){
             case "Listar":
                 List lista=embd.listar();
                 request.setAttribute("empleados", lista);
                 break;
             case "Agregar":
                 String dni=request.getParameter("txtDni");
                 String nomb=request.getParameter("txtNombres");
                 String telf=request.getParameter("txtTelefono");
                 String estad=request.getParameter("txtEstado");
                 String user=request.getParameter("txtUsuario");
                 em.setDni(dni);
                 em.setNomb(nomb);
                 em.setTelf(telf);
                 em.setEstad(estad);
                 em.setUser(user);
                 embd.agregar(em);
                 request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                 break;
             case "Editar":
                 idempleado=Integer.parseInt(request.getParameter("id"));
                 Empleado e=embd.listarId(idempleado);
                 request.setAttribute("empleado", e);
                 request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                 break;
             case "Actualizar":
                 
                 String adni=request.getParameter("txtDni");
                 String anomb=request.getParameter("txtNombres");
                 String atelf=request.getParameter("txtTelefono");
                 String aestad=request.getParameter("txtEstado");
                 String auser=request.getParameter("txtUsuario");
                 em.setDni(adni);
                 em.setNomb(anomb);
                 em.setTelf(atelf);
                 em.setEstad(aestad);
                 em.setUser(auser);
                 em.setId(idempleado);
                 embd.actualizar(em);
                 request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                 break;
             case "Eliminar":
                 idempleado=Integer.parseInt(request.getParameter("id"));
                 embd.Eliminar(idempleado);
                 request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                 break;
             default:
                 throw new AssertionError();
            }
             request.getRequestDispatcher("Empleado.jsp").forward(request, response);
         }
         if(menu.equals("Cliente")){
             switch(accion){
             case "Listar":
                 List lista=clbd.listar();
                 request.setAttribute("clientes", lista);
                 break;
             case "Agregar":
                 String dni=request.getParameter("txtDni");
                 String nomb=request.getParameter("txtNombres");
                 String direcc=request.getParameter("txtDireccion");
                 String estad=request.getParameter("txtEstado");
                 cl.setDni(dni);
                 cl.setNomb(nomb);
                 cl.setDirecc(direcc);
                 cl.setEstad(estad);
                 clbd.agregar(cl);
                 request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                 break;
             case "Editar":
                 idcliente=Integer.parseInt(request.getParameter("id"));
                 Cliente c=clbd.listarId(idcliente);
                 request.setAttribute("cliente", c);
                 request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                 
                 break;
             case "Actualizar":
                 
                 String adni=request.getParameter("txtDni");
                 String anomb=request.getParameter("txtNombres");
                 String adirecc=request.getParameter("txtDireccion");
                 String aestad=request.getParameter("txtEstado");
                 cl.setDni(adni);
                 cl.setNomb(anomb);
                 cl.setDirecc(adirecc);
                 cl.setEstad(aestad);
                 cl.setId(idcliente);
                 clbd.actualizar(cl);
                 request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                 break;
             case "Eliminar":
                 idcliente=Integer.parseInt(request.getParameter("id"));
                 clbd.Eliminar(idcliente);
                 request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                 break;
             default:
                 throw new AssertionError();
            }
             request.getRequestDispatcher("Clientes.jsp").forward(request, response);
         }
         if(menu.equals("Producto")){
             switch(accion){
             case "Listar":
                 List lista=prbd.listar();
                 request.setAttribute("productos", lista);
                 break;
             case "Agregar":
                 String nomb=request.getParameter("txtNombres");
                 double precio=Double.parseDouble(request.getParameter("txtPrecio"));
                 int stok=Integer.parseInt(request.getParameter("txtStock"));
                 String estad=request.getParameter("txtEstado");
                 pr.setNomb(nomb);
                 pr.setPrecio(precio);
                 pr.setStok(stok);
                 pr.setEstad(estad);
                 prbd.agregar(pr);
                 request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                 break;
             case "Editar":
                 idproducto=Integer.parseInt(request.getParameter("id"));
                 Producto p=prbd.listarId(idproducto);
                 request.setAttribute("producto", p);
                 request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                 break;
             case "Actualizar":
                 String anomb=request.getParameter("txtNombres");
                 double aprecio=Double.parseDouble(request.getParameter("txtPrecio"));
                 int astok=Integer.parseInt(request.getParameter("txtStock"));
                 String aestad=request.getParameter("txtEstado");
                 pr.setNomb(anomb);
                 pr.setPrecio(aprecio);
                 pr.setStok(astok);
                 pr.setEstad(aestad);
                 pr.setId(idproducto);
                 prbd.actualizar(pr);
                 request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                 break;
             case "Eliminar":
                 idproducto=Integer.parseInt(request.getParameter("id"));
                 prbd.Eliminar(idproducto);
                 request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                 break;
             default:
                 throw new AssertionError();
            }
             request.getRequestDispatcher("Producto.jsp").forward(request, response);
         }
         if(menu.equals("NuevaVenta")){
             request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
         }
         /*switch(accion){
             case "Principal":
                 request.getRequestDispatcher("Principal.jsp").forward(request, response);
                 break;
             case "Empleado":
                 request.getRequestDispatcher("Empleado.jsp").forward(request, response);
                 break;
             case "Producto":
                 request.getRequestDispatcher("Producto.jsp").forward(request, response);
                 break;
             case "Cliente":
                 request.getRequestDispatcher("Clientes.jsp").forward(request, response);
                 break;
             case "NuevaVenta":
                 request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
                 break;
             default:
                 throw new AssertionError();
        }*/      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
