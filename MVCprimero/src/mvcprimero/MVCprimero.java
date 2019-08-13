/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcprimero;

import controlador.Controlador1;
import modelo.Modelo;
import vista.Vista1;

/**
 *
 * @author Hernan
 */
public class MVCprimero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo mod = new Modelo();
        Vista1 vis = new Vista1();
        
        Controlador1 controler = new Controlador1(vis, mod);
        controler.iniciar();
        vis.setVisible(true);
        
        // TODO code application logic here
    }
    
}
