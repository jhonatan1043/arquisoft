/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.VSubComponente;
import views.VPrincipal;

/**
 *
 * @author Programador 1
 */
public class PrincipalController implements ActionListener {

    VPrincipal viewPrincipal = new VPrincipal();
    
    public PrincipalController(VPrincipal viewPrincipal){
        this.viewPrincipal = viewPrincipal;
        this.viewPrincipal.itemComponente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.viewPrincipal.itemComponente) {
            VSubComponente viewComponente = null;
            try {
                viewComponente = new VSubComponente();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.viewPrincipal.Desktop.add(viewComponente);
            viewComponente.setVisible(true);
        }
    }

}
