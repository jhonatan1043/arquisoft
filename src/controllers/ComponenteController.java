/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import generals.ValidButtonSystem;
import generals.ValidControlsSystem;
import generals.ValidTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import views.VComponente;

/**
 *
 * @author Programador 1
 */
public class ComponenteController implements ActionListener {
    int index;
    DefaultTableModel modelo;
    VComponente viewPerfilComp;
 
    public ComponenteController(VComponente viewPerfilComp) {
        this.viewPerfilComp = viewPerfilComp;
        start();
    }

    private void initEvent() {
        viewPerfilComp.btnAgregar.addActionListener(this);
        viewPerfilComp.btnRemover.addActionListener(this);
        viewPerfilComp.btnNew.addActionListener(this);
        viewPerfilComp.btnCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.viewPerfilComp.btnNew) {
            ValidControlsSystem.enabledControls(viewPerfilComp);
            ValidButtonSystem.disableButton(viewPerfilComp.pnlButton);
            viewPerfilComp.btnSave.setEnabled(true);
            viewPerfilComp.btnCancel.setEnabled(true);

        }

        if (e.getSource() == this.viewPerfilComp.btnCancel) {
            ValidControlsSystem.disableControls(viewPerfilComp);
            ValidButtonSystem.disableButton(viewPerfilComp.pnlButton);
            viewPerfilComp.btnNew.setEnabled(true);
        }

        if (e.getSource() == this.viewPerfilComp.btnAgregar) {
            this.setRows();
        }

        if (e.getSource() == this.viewPerfilComp.btnRemover) {
            this.setRowsRemove();
        }
    }

    public final void start() {
        ValidControlsSystem.disableControls(viewPerfilComp);
        ValidButtonSystem.disableButton(viewPerfilComp.pnlButton);
        this.hideColumns();
        this.initEvent();
        modelo = (DefaultTableModel) viewPerfilComp.tbComponente.getModel();
        viewPerfilComp.btnNew.setEnabled(true);
    }

    public void setRows() {
        Object[] fila = new Object[1];
        modelo.addRow(fila);
    }

    public void setRowsRemove() {
        modelo.removeRow(index);
    }

    private void hideColumns() {
        int[] list = {0};
        ValidTable.hideColumnsTable(viewPerfilComp.tbComponente, list);
    }


}
