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

public class ProductoBD {
   Conexion cn=new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int r;
   //CREANDO LAS OPERACIONES (CRUD)
   public List listar(){
       String sql="select * from producto";
       List<Producto>lista =new ArrayList<>();
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               Producto pr=new Producto();
               pr.setId(rs.getInt(1));
               pr.setNomb(rs.getString(2));
               pr.setPrecio(rs.getDouble(3));
               pr.setStok(rs.getInt(4));
               pr.setEstad(rs.getString(5));
               
               lista.add(pr);
             
           }
       } catch(Exception e){
           
       }
       return lista;
   } 
   public int agregar(Producto pr){
       String sql="insert into producto(Nombres,Precio,Stock,Estado)values(?,?,?,?)";
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           //--------------------------
           ps.setString(1, pr.getNomb());
           ps.setDouble(2, pr.getPrecio());
           ps.setInt(3, pr.getStok());
           ps.setString(4, pr.getEstad());
           ps.executeUpdate();
       } catch(Exception e){
       }
       return r;
   }
   public Producto listarId(int id){
       Producto pr=new Producto();
       String sql="select * from producto where IdProducto="+id;
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               pr.setId(rs.getInt(1));
               pr.setNomb(rs.getString(2));
               pr.setPrecio(rs.getDouble(3));
               pr.setStok(rs.getInt(4));
               pr.setEstad(rs.getString(5));
           }
       } catch(Exception e){
       }
       return pr;
   }
   public int actualizar(Producto pr){
       String sql="update producto set Nombres=?,Precio=?,Stock=?,Estado=?, where=IdProducto=?";
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           //--------------------------
           ps.setString(1, pr.getNomb());
           ps.setDouble(2, pr.getPrecio());
           ps.setInt(3, pr.getStok());
           ps.setString(4, pr.getEstad());
           ps.setInt(5, pr.getId());
           ps.executeUpdate();
       } catch(Exception e){
       }
       return r;
   }
   public void Eliminar(int id){
       String sql="delete from producto where=IdProducto="+id;
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           //--------------------------
           ps.executeUpdate();
       } catch(Exception e){
       }
   }
}
