/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programador 1
 */
public class Querys {

    public Querys() {
    }

    public ArrayList<String> queryComboReturn(String sqlConsult) throws ClassNotFoundException {
        ResultSet result = null;
        Statement statement = null;
        ArrayList<String> list = new ArrayList<>();

        try {
            statement = (Statement) Conexion.conectar().createStatement();
           
            result = statement.executeQuery(sqlConsult);
            list.add(Contans.SELECTING);
            
            if (result.getRow() > 0) {
                while (result.next()) {
                    list.add(result.getInt(0) + "|" + result.getString(1));
                }
            }
            statement.close();
            result.close();
            Conexion.conectar().close();
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
