/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conig;

/**
 *
 * @author usuario
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bd_ventas";
    String user="root";
    String password="davidsc161731";
    public Connection Conexion() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            //System.out.println(e.toString());
            //return null;
        }
        return con;
    }

}