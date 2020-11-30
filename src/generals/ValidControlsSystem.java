/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generals;

import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Programador 1
 */
public class ValidControlsSystem {

    private static void disableControls(javax.swing.JPanel form) {
        for (int i = 0; i < form.getComponentCount(); i++) {
            if (form.getComponent(i) instanceof JTextField) {
                ((JTextField) form.getComponent(i)).setEnabled(false);
            } else if (form.getComponent(i) instanceof JComboBox) {
                ((JComboBox) form.getComponent(i)).setEnabled(false);
            } else if (form.getComponent(i) instanceof JSpinner) {
                ((JSpinner) form.getComponent(i)).setEnabled(false);
            }else if (form.getComponent(i) instanceof JPanel) {
                disableControls(((JPanel) form.getComponent(i)));
            } else if (form.getComponent(i) instanceof JLayeredPane) {
                disableControls(((JLayeredPane) form.getComponent(i)));
            }
        }
    }

    public static void disableControls(javax.swing.JLayeredPane form) {
        System.out.println("JLayeredPane");
        for (int i = 0; i < form.getComponentCount(); i++) {
            if (form.getComponent(i) instanceof JTextField) {
                ((JTextField) form.getComponent(i)).setEnabled(false);
            } else if (form.getComponent(i) instanceof JComboBox) {
                ((JComboBox) form.getComponent(i)).setEnabled(false);
            } else if (form.getComponent(i) instanceof JSpinner) {
                ((JSpinner) form.getComponent(i)).setEnabled(false);
            } else if (form.getComponent(i) instanceof JPanel) {
                disableControls(((JPanel) form.getComponent(i)));
            } else if (form.getComponent(i) instanceof JLayeredPane) {
                disableControls(((JLayeredPane) form.getComponent(i)));
            }
        }
    }

    private static void enabledControls(javax.swing.JPanel form) {
        for (int i = 0; i < form.getComponentCount(); i++) {
            if (form.getComponent(i) instanceof JTextField) {
                ((JTextField) form.getComponent(i)).setEnabled(true);
            } else if (form.getComponent(i) instanceof JComboBox) {
                ((JComboBox) form.getComponent(i)).setEnabled(true);
            } else if (form.getComponent(i) instanceof JSpinner) {
                ((JSpinner) form.getComponent(i)).setEnabled(true);
            }else if (form.getComponent(i) instanceof JPanel) {
                enabledControls(((JPanel) form.getComponent(i)));
            } else if (form.getComponent(i) instanceof JLayeredPane) {
                enabledControls(((JLayeredPane) form.getComponent(i)));
            }
        }
    }

    public static void enabledControls(javax.swing.JLayeredPane form) {
        for (int i = 0; i < form.getComponentCount(); i++) {
            if (form.getComponent(i) instanceof JTextField) {
                ((JTextField) form.getComponent(i)).setEnabled(true);
            } else if (form.getComponent(i) instanceof JComboBox) {
                ((JComboBox) form.getComponent(i)).setEnabled(true);
            } else if (form.getComponent(i) instanceof JSpinner) {
                ((JSpinner) form.getComponent(i)).setEnabled(true);
            }else if (form.getComponent(i) instanceof JPanel) {
                enabledControls(((JPanel) form.getComponent(i)));
            } else if (form.getComponent(i) instanceof JLayeredPane) {
                enabledControls(((JLayeredPane) form.getComponent(i)));
            }
        }
    }

}
