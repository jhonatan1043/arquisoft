/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.PerfilComponente;

/**
 *
 * @author Programador 1
 */
public interface IPerfilComponente {
    public boolean save(PerfilComponente perfilComponente);
    public boolean update(PerfilComponente perfilComponente);
    public boolean delete(PerfilComponente perfilComponente);
    public List<PerfilComponente> listar();
    public PerfilComponente getPerfilComponente(int idPerfil);
}
