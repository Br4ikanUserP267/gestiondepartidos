/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gstionencuentros;

import Presentacion.Gui_Encuentros;

/**
 *
 * @author ASUS
 */
public class GstionEncuentros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Encuentros().setVisible(true);
            }
        });
    }
    
}
