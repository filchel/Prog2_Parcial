/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2017;

import java.util.Random;

/**
 *
 * @author damian
 */
public class Verificacion2 {
    
    //Variables
    Random r = new Random();
    char matriz[][] = new char[6][3];
   
    //Carga letras aleatorias en una matriz
    protected void letrasAleatoria() {
        
        //Carga las letras en la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                matriz[i][j] = (char) generaLetra();
            }
        }
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    private char generaLetra() {

        int valorLetra = (r.nextInt(25) + 65);
        
        if(repetida(valorLetra)) {
            valorLetra = generaLetra();
        }
        return (char) valorLetra;
    }
    
    private Boolean repetida(int valorLetra) {
        
        Boolean repetida = false;
        
        for(char[] row : matriz) {
            for(char col : row) {
                if(col == valorLetra)
                    repetida = true;
                }
            
        }
        return repetida;
    }
}
