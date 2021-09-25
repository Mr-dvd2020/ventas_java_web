/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import conig.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class EmpleadoBD {
   Conexion cn=new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int r;
   public Empleado validar(String user, String dni){
       Empleado em=new Empleado();
       String sql="select * from empleado where User=? and Dni=?";
       //String sql="INSERT INTO cliente (IdCliente, Dni, Nombres, Direccion, Estado) VALUES (25, '7', 'David Guerrero Paz', 'Los Rapidos', '1')";
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           ps.setString(1,user);
           ps.setString(2,dni);
           rs=ps.executeQuery();
           while(rs.next()){
               em.setId(rs.getInt("IdEmpleado"));
               em.setUser(rs.getString("User"));
               em.setDni(rs.getString("Dni"));
               em.setNomb(rs.getString("Nombres"));
           }
       }catch(Exception e){
       }
       return em;
   }
   //CREANDO LAS OPERACIONES (CRUD)
   public List listar(){
       String sql="select * from empleado";
       List<Empleado>lista =new ArrayList<>();
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               Empleado em=new Empleado();
               em.setId(rs.getInt(1));
               em.setDni(rs.getString(2));
               em.setNomb(rs.getString(3));
               em.setTelf(rs.getString(4));
               em.setEstad(rs.getString(5));
               em.setUser(rs.getString(6));
               lista.add(em);
             
           }
       } catch(Exception e){
           
       }
       return lista;
   } 
   public int agregar(Empleado em){
       String sql="insert into empleado(Dni,Nombres,Telefono,Estado,User)values(?,?,?,?,?)";
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           //--------------------------
           ps.setString(1, em.getDni());
           ps.setString(2, em.getNomb());
           ps.setString(3, em.getTelf());
           ps.setString(4, em.getEstad());
           ps.setString(5, em.getUser());
           ps.executeUpdate();
       } catch(Exception e){
       }
       return r;
   }
   public Empleado listarId(int id){
       Empleado em=new Empleado();
       String sql="select * from empleado where IdEmpleado="+id;
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               em.setId(rs.getInt(1));
               em.setDni(rs.getString(2));
               em.setNomb(rs.getString(3));
               em.setTelf(rs.getString(4));
               em.setEstad(rs.getString(5));
               em.setUser(rs.getString(6));
           }
       } catch(Exception e){
       }
       return em;
   }
   public int actualizar(Empleado em){
       String sql="update empleado set Dni=?,Nombres=?,Telefono=?,Estado=?,User=? where=IdEmpleado=?";
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           //--------------------------
           ps.setString(1, em.getDni());
           ps.setString(2, em.getNomb());
           ps.setString(3, em.getTelf());
           ps.setString(4, em.getEstad());
           ps.setString(5, em.getUser());
           ps.setInt(6, em.getId());
           ps.executeUpdate();
       } catch(Exception e){
       }
       return r;
   }
   public void Eliminar(int id){
       String sql="delete from empleado where=IdEmpleado="+id;
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           //--------------------------
           ps.executeUpdate();
       } catch(Exception e){
       }
   }
}
