/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author usuario
 */
import conig.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteBD {
   Conexion cn=new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int r;
   //CREANDO LAS OPERACIONES (CRUD)
   public List listar(){
       String sql="select * from cliente";
       List<Cliente>lista =new ArrayList<>();
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               Cliente cl=new Cliente();
               cl.setId(rs.getInt(1));
               cl.setDni(rs.getString(2));
               cl.setNomb(rs.getString(3));
               cl.setDirecc(rs.getString(4));
               cl.setEstad(rs.getString(5));
               
               lista.add(cl);
             
           }
       } catch(Exception e){
           
       }
       return lista;
   } 
   public int agregar(Cliente cl){
       String sql="insert into cliente(Dni,Nombres,Direccion,Estado)values(?,?,?,?)";
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           //--------------------------
           ps.setString(1, cl.getDni());
           ps.setString(2, cl.getNomb());
           ps.setString(3, cl.getDirecc());
           ps.setString(4, cl.getEstad());
           ps.executeUpdate();
       } catch(Exception e){
       }
       return r;
   }
   public Cliente listarId(int id){
       Cliente cl=new Cliente();
       String sql="select * from cliente where IdCliente="+id;
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               //cl.setId(rs.getInt(1));
               cl.setDni(rs.getString(2));
               cl.setNomb(rs.getString(3));
               cl.setDirecc(rs.getString(4));
               cl.setEstad(rs.getString(5));
           }
       } catch(Exception e){
       }
       return cl;
   }
   public int actualizar(Cliente cl){
       String sql="UPDATE cliente SET Dni=?,Nombres=?,Direccion=?,Estado=? Where IdCliente=?";
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           //--------------------------
           ps.setString(1, cl.getDni());
           ps.setString(2, cl.getNomb());
           ps.setString(3, cl.getDirecc());
           ps.setString(4, cl.getEstad());
           ps.setInt(5, cl.getId());
           ps.executeUpdate();
       } catch(Exception e){
       }
       return r;
   }
   public void Eliminar(int id){
       String sql="delete from cliente where IdCliente="+id;
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           //--------------------------
           ps.executeUpdate();
       } catch(Exception e){
       }
   }
}
