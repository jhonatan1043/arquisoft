/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import generals.Combos;
import generals.Contans;
import generals.ValidButtonSystem;
import generals.ValidControlsSystem;
import generals.ValidTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        viewPerfilComp.comboSubComponente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.viewPerfilComp.btnNew) {
            ValidControlsSystem.enabledControls(viewPerfilComp.jLayeredPane1);
            ValidButtonSystem.disableButton(viewPerfilComp.pnlButton);
            viewPerfilComp.btnSave.setEnabled(true);
            viewPerfilComp.btnCancel.setEnabled(true);

        }

        if (e.getSource() == this.viewPerfilComp.btnCancel) {
            ValidControlsSystem.disableControls(viewPerfilComp.jLayeredPane1);
            ValidButtonSystem.disableButton(viewPerfilComp.pnlButton);
            viewPerfilComp.btnNew.setEnabled(true);
        }

        if (e.getSource() == this.viewPerfilComp.btnAgregar) {
            this.setRows();
        }

        if (e.getSource() == this.viewPerfilComp.btnRemover) {
            this.setRowsRemove();
        }

        if (e.getSource() == this.viewPerfilComp.comboSubComponente) {
            if (viewPerfilComp.comboSubComponente.getSelectedIndex() != 0) {
                String codigo = this.viewPerfilComp.comboSubComponente.getSelectedItem().toString().substring(2, 12);
                this.viewPerfilComp.txtCodigoSubComp.setText(codigo);
            }
        }
    }

    public final void start() {
        ValidControlsSystem.disableControls(viewPerfilComp.jLayeredPane1);
        ValidButtonSystem.disableButton(viewPerfilComp.pnlButton);
        this.hideColumns();
        this.initEvent();
        this.cargarComboCategoria();
        this.cargarComboSubComponente();
        modelo = (DefaultTableModel) viewPerfilComp.tbComponente.getModel();
        viewPerfilComp.btnNew.setEnabled(true);
    }

    public void setRows() {
        Object[] fila = new Object[10];
        int tipoCategoria = (int) viewPerfilComp.comboCategoria.getSelectedIndex();
        int logitud = (int) viewPerfilComp.txtLongitud.getValue();
        int anchura = (int) viewPerfilComp.txtAnchura.getValue();
        int altura = (int) viewPerfilComp.txtAltura.getValue();
        int area = (int) viewPerfilComp.txtArea.getValue();
        int incremento = (int) viewPerfilComp.txtIncremento.getValue();

        fila[0] = this.viewPerfilComp.comboSubComponente.getSelectedItem().toString().split("0")[0];
        fila[1] = viewPerfilComp.txtCodigoSubComp.getText();
        fila[2] = viewPerfilComp.comboSubComponente.getSelectedItem().toString().substring(13);
        fila[3] = viewPerfilComp.txtCantidad.getValue();
        fila[4] = logitud;
        fila[5] = anchura;
        fila[6] = altura;
        fila[7] = area;
        fila[8] = incremento;
        fila[9] = this.setCalcularMedida(tipoCategoria, logitud, anchura, altura, area, incremento);
        modelo.addRow(fila);
        controllersClear();
    }

    public void setRowsRemove() {
        modelo.removeRow(index);
    }

    private int setCalcularMedida(int idCategoria,
            int logitud,
            int altura,
            int anchura,
            int area,
            int incremento) {
        int resultado = 0;

        switch (idCategoria) {

            case 1:
                resultado = logitud + incremento;
                break;
            case 2:
                break;
            case 3:
                break;
        }

        return resultado;
    }

    private void hideColumns() {
        int[] list = {0};
        ValidTable.hideColumnsTable(viewPerfilComp.tbComponente, list);
    }

    private void cargarComboCategoria() {
        Combos combo = new Combos();
        combo.setSqlConsult(Contans.QUERY_CATEGORIAS);
        try {
            combo.setCombo(viewPerfilComp.comboCategoria);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComponenteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarComboSubComponente() {
        Combos combo = new Combos();
        combo.setSqlConsult(Contans.QUERY_SUBCOMPONENTES);
        try {
            combo.setComboSubComponente(viewPerfilComp.comboSubComponente);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComponenteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void controllersClear() {
        this.viewPerfilComp.txtCodigoSubComp.setText("");
        this.viewPerfilComp.comboSubComponente.setSelectedIndex(0);
        this.viewPerfilComp.txtIncremento.setValue(0);
        this.viewPerfilComp.txtCantidad.setValue(0);
        this.viewPerfilComp.txtAltura.setValue(0);
        this.viewPerfilComp.txtAnchura.setValue(0);
        this.viewPerfilComp.txtLongitud.setValue(0);
        this.viewPerfilComp.txtArea.setValue(0);
    }

}
