/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import generals.Contans;
import generals.Querys;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.SubComponente;
import interfaces.ISubComponente;

/**
 *
 * @author Programador 1
 */
public class ESubComponente implements ISubComponente {

    Querys query = new Querys();

    @Override
    public boolean save(SubComponente componente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SubComponente componente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(SubComponente componente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SubComponente> listar() {
        List<SubComponente> listComponente = new ArrayList<>();
        ResultSet result = query.queryListComponente(Contans.QUERY_COMPONENTES);
        try {
            while (result.next()) {
                SubComponente componente = new SubComponente();
                componente.setIdComponente(result.getInt(0));
                componente.setCodigo(result.getString(1));
                componente.setDescripcion(result.getString(2));
                listComponente.add(componente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ESubComponente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listComponente;
    }

    @Override
    public SubComponente getComponente(int idComponente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
