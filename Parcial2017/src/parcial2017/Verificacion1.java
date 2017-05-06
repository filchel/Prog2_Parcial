/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2017;

import javax.swing.JOptionPane;

/**
 *
 * @author federico
 */
public class Verificacion1 {
    
    //Usuario y contraseña finales
    private static final String usuario = "alberto";
    private static final String contraseña = "cortez";

    public Verificacion1() {
    }
    
    
    public static String getContraseña() {
        return contraseña;
    }

    public static String getUsuario() {
        return usuario;
    }
    
    public void validacion() {
        
        //Variables
        int intentos = 0;
        int validacion = 0;
        
        //Variables de ingreso
        String cUsuario;
        String cContraseña;
        
        do {
            cUsuario = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario:");
            cContraseña = JOptionPane.showInputDialog(null, "Ingrese la contraseña");
            
            //Validacion correcta
            if (cUsuario.equals(usuario) && cContraseña.equals(contraseña)) {
                validacion = 1;
                break;
            //Validacion incorrecta
            } else {
                intentos++;
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos (Intento " + intentos + " de 3)");
                validacion = 0;
            }
        } while (intentos < 3);
        
        //Switch de validacion
        switch (validacion) {
            case 0:
                JOptionPane.showMessageDialog(null, "Alcanzado el número máximo de intentos, vuelva en 24hs");
                break;
            case 1:
                System.out.println("Bienvenido al cajero");
                break;
            default:
                throw new AssertionError();
        }
    }
}
