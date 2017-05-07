/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2017;

import menu.alfa;

/**
 *
 * @author federico
 */
public class Parcial2017 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //Llamada de verificacion de ususario y contraseña
        //Verificacion1 ver1 = new Verificacion1();

        alfa ventana = new alfa();

        ventana.setVisible(true);
        Verificacion2 ver2 = new Verificacion2();

        


        //ver1.validacion();
        ver2.letrasAleatoria();
        
        SeleccionClave selec1 = new SeleccionClave();
        
        selec1.cargaArray();
    }    
}
