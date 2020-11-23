/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import generals.ValidForm;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programador 1
 */
public class VPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form vPrincipal
     */
    public VPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Desktop.setSize(screenSize.width, screenSize.height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Desktop = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemComponente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemAcabado = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemUnidadMedida = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemCorte = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemIniciar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArquitectSoft");
        setAlwaysOnTop(true);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(Desktop, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jMenu1.setText("Opciones");

        itemComponente.setText("Componentes");
        itemComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComponenteActionPerformed(evt);
            }
        });
        jMenu1.add(itemComponente);
        jMenu1.add(jSeparator1);

        itemAcabado.setText("Acabados");
        itemAcabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcabadoActionPerformed(evt);
            }
        });
        jMenu1.add(itemAcabado);
        jMenu1.add(jSeparator2);

        itemUnidadMedida.setText("Unidades de Medidas");
        itemUnidadMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUnidadMedidaActionPerformed(evt);
            }
        });
        jMenu1.add(itemUnidadMedida);
        jMenu1.add(jSeparator3);

        itemCorte.setText("Cortes");
        itemCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCorteActionPerformed(evt);
            }
        });
        jMenu1.add(itemCorte);

        jMenuBar2.add(jMenu1);

        jMenu4.setText("Proyecto");

        itemIniciar.setText("Iniciar");
        itemIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIniciarActionPerformed(evt);
            }
        });
        jMenu4.add(itemIniciar);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniciarActionPerformed
        VPerfilComponente viewPerfil = new VPerfilComponente();
        this.Desktop.add(viewPerfil);
        ValidForm.centeForm(viewPerfil, Desktop);
        viewPerfil.show();
    }//GEN-LAST:event_itemIniciarActionPerformed

    private void itemComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComponenteActionPerformed
        VComponente viewComponente = null;
        try {
            viewComponente = new VComponente();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.Desktop.add(viewComponente);
        ValidForm.centeForm(viewComponente, Desktop);
        viewComponente.show();
    }//GEN-LAST:event_itemComponenteActionPerformed

    private void itemAcabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcabadoActionPerformed
        VAcabado viewAcabado = new VAcabado();
        this.Desktop.add(viewAcabado);
        ValidForm.centeForm(viewAcabado, Desktop);
        viewAcabado.show();
    }//GEN-LAST:event_itemAcabadoActionPerformed

    private void itemUnidadMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUnidadMedidaActionPerformed
        VUnidadMedida viewUnidadMedida = new VUnidadMedida();
        this.Desktop.add(viewUnidadMedida);
        ValidForm.centeForm(viewUnidadMedida, Desktop);
        viewUnidadMedida.show();
    }//GEN-LAST:event_itemUnidadMedidaActionPerformed

    private void itemCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCorteActionPerformed
        VCorte viewCorte = new VCorte();
        this.Desktop.add(viewCorte);
        ValidForm.centeForm(viewCorte, Desktop);
        viewCorte.show();
    }//GEN-LAST:event_itemCorteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Desktop;
    public javax.swing.JMenuItem itemAcabado;
    public javax.swing.JMenuItem itemComponente;
    private javax.swing.JMenuItem itemCorte;
    public javax.swing.JMenuItem itemIniciar;
    public javax.swing.JMenuItem itemUnidadMedida;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
