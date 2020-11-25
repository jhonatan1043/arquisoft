/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import generals.Contans;
import generals.Querys;
import interfaces.IComponente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Componente;

/**
 *
 * @author Programador 1
 */
public class EComponente implements IComponente {

    Querys query = new Querys();

    @Override
    public boolean save(Componente componente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Componente componente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Componente componente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Componente> listar() {
        List<Componente> listComponente = new ArrayList<>();
        ResultSet result = query.queryListComponente(Contans.QUERY_COMPONENTES);
        try {
            while (result.next()) {
                Componente componente = new Componente();
                componente.setIdComponente(result.getInt(0));
                componente.setCodigo(result.getString(1));
                componente.setDescripcion(result.getString(2));
                listComponente.add(componente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EComponente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listComponente;
    }

    @Override
    public Componente getComponente(int idComponente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
