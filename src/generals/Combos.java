/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generals;
import java.util.ArrayList;


public class Combos {
    
    private String sqlConsult;
    Querys query = new Querys();
    
    public Combos() {
    }
    
    public void setCombo(javax.swing.JComboBox combo) throws ClassNotFoundException {
        ArrayList<String> list = query.queryComboReturn(sqlConsult);
        combo.addItem(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            combo.addItem(list.get(i));
        }    
    }
    
    public void setSqlConsult(String sqlConsult) {
        this.sqlConsult = sqlConsult;
    }
    
}
