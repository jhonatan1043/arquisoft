/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.VSubComponente;
import entity.ESubComponente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.SubComponente;
/**
 *
 * @author Programador 1
 */
public class SubComponenteController implements ActionListener {
    VSubComponente vcomponente;
    ESubComponente ecomponente =  new ESubComponente();
    SubComponente componente = new SubComponente();

    public SubComponenteController() throws ClassNotFoundException {
        this.vcomponente = new VSubComponente();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    
    
}
