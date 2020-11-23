/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generals;

import java.sql.*;

/**
 *
 * @author Programador 1
 */
public class Conexion {

      public static com.mysql.jdbc.Connection conectar() throws ClassNotFoundException {
        com.mysql.jdbc.Connection con = null;
        
        String usuario = "root";
        String password = "p0s31d0n";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/arquitectdb",usuario,password);            
            if (con != null) {
                System.out.println("Conectad'''o");
            }
        } catch (SQLException e) {
            System.err.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }    
        return con;
    }



}
