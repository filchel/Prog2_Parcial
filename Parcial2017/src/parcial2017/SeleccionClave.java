/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2017;

import java.util.Random;

/**
 *
 * @author Juani
 */
public class SeleccionClave {
    Random r = new Random();
    char[] clave = new char[8];
    
    protected void cargaArray (){
        for (int i = 0; i < 8; i++) {        
        clave[i] = (char) generaLetra();
        System.out.println("letra "+(i+1)+": "+clave[i] );
        }
    }
    
    private char generaLetra() {

    int valorLetra = (r.nextInt(24) + 65);
        
      if(repetida(valorLetra)) {
         valorLetra = generaLetra();
      }
      return (char) valorLetra;
    }
    
    private Boolean repetida(int valorLetra) {
        
     Boolean repetida = false;
     
        for (int i = 0; i < clave.length; i++) {
            if(clave[i] == valorLetra) {
              repetida = true;
          } else {
          }
            
        }
        return repetida;
            
    }
        
}


    
    
    

