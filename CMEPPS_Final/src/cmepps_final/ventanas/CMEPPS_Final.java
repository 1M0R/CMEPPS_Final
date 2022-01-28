package cmepps_final.ventanas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cmepps_final.variabs.Elemento;
import javax.swing.WindowConstants;
import cmepps_final.ventanas.VentanaPrincipal;
import java.util.ArrayList;


public class CMEPPS_Final {

    /**
     * @param args the command line arguments
     */
    
    
    static ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        vp.setLocationRelativeTo(null);
        
    }
    
}
