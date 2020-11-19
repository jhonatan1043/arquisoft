/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generals;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Programador 1
 */
public class Conexion {

    Connection cnx = null;

    public Conexion() {
        try {
            String rootFile = System.getProperty("user.dir") + "//arquitectDB.accdb";
            String url = "jdbc:ucanaccess://" + rootFile;
            cnx = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CONEXION ERRONEA" + e);
        }
    }

    public Connection getConnection() {
        return cnx;
    }

    public void connectionClosed() {
        try {
            cnx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
