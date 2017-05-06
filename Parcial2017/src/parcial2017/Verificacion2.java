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
    //Comprobacion de letras
    
protected static void letraAleatoria(){ 
        
    //Creamos el Random y un Array de 3 valores
        Random r = new Random();
        char array[] = new char[3];
 
    //Llenamos el array con letras llamandolas por su valor en ASCII (25)+97
        for(int i=0; i<array.length; i++) {
            int valorLetra = (r.nextInt(25)+97);
            array[i] = (char) valorLetra;
        }
    
    //Imprimimos los tres caracteres
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
       }
 
}

