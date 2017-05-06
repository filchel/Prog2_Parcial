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
public class Parcial2017 {
    
    //Variables globales:
    //Finales, no se pueden modificar
    public static final String usuarioGlobal = "federico";
    public static final String passGlobal = "filchel123";
    
    //Se pueden modificar
    public static double saldoGlobal = 1000;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables globales                                              
        int intentos = 0;
        int validacion = 0;

        //variables de ingreso        
        String cadenaUsuario;
        String cadenaPass;
        
        do {
            cadenaUsuario = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario: ");
            cadenaPass = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ");
             
            // Validacion correcta
            if (cadenaUsuario.equals(usuarioGlobal) && cadenaPass.equals(passGlobal)) {              
                validacion = 1;
                break;
            // Validacion erronea
            } else {
                intentos++;
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos (Intento: " + intentos + " de 3)");
                validacion = 0;
            }            
        } while (intentos < 3);
        
        // Switch de validacion
        switch (validacion) {
            case 0:
                JOptionPane.showMessageDialog(null, "Alcanzado el número máximo de intentos, vuelva en 24h");              
                break;
            case 1:
                menu();
                break;
            default:
                throw new AssertionError();
        }
    }

    // Subprograma de menu
    public static void menu() {                                
        // Variables locales
        int menu;
        String cadenaMenu;      
        
        do {
            cadenaMenu = JOptionPane.showInputDialog(null, "Menu del cajero"
                    + "\n\n1 - Consulta\n2 - Depósito\n3 - Extracción\n4 - Salir");
            menu = Integer.parseInt(cadenaMenu);
        
        //Switch del menu
        switch (menu) {
            case 1:
                // Consulta
                JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + saldoGlobal);
                break;
            case 2:
                // Deposito
                deposito();
                break;
            case 3:
                // Extraccion
                extraccion();
                break;
            case 4:
                // Salir
                break;
            default:
                // Error
                JOptionPane.showMessageDialog(null, "Opción incorrecta, intente nuevamente");
        }
        } while (menu != 4);        
    }
    
    public static void deposito() {
        // Variables locales
        double deposito;
        String cadenaDeposito;
                
        JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + saldoGlobal);
        cadenaDeposito = JOptionPane.showInputDialog(null, "Ingrese la cantidad a depositar");
        deposito = Double.parseDouble(cadenaDeposito);
        saldoGlobal = saldoGlobal + deposito;
        JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + saldoGlobal);
    }
    
    public static void extraccion() {
        // Variables locales
        int extraccion;
        String cadenaExtraccion;
        
        JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + saldoGlobal);
        
        cadenaExtraccion = JOptionPane.showInputDialog(null, "Menu de extracción\n\n1 - $100      2 - $200"
                + "\n3 - $300      4 - $500\n5 - Otro      6 - Atras");
        extraccion = Integer.parseInt(cadenaExtraccion);
        
        switch (extraccion) {
            case 1:
                if (extraccion <= saldoGlobal) {
                    saldoGlobal = saldoGlobal - 100;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + saldoGlobal);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede retirar mas dinero del que tiene");
                }
                break;
            case 2:
                if (extraccion <= saldoGlobal) {
                    saldoGlobal = saldoGlobal - 200;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + saldoGlobal);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede retirar mas dinero del que tiene");
                }
                break;
            case 3:
                if (extraccion <= saldoGlobal) {
                    saldoGlobal = saldoGlobal - 300;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + saldoGlobal);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede retirar mas dinero del que tiene");
                }
                break;
            case 4:
                if (extraccion <= saldoGlobal) {
                    saldoGlobal = saldoGlobal - 500;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + saldoGlobal);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede retirar mas dinero del que tiene");
                }
                break;
            case 5:
                double otro;
                String cOtro;
                
                cOtro = JOptionPane.showInputDialog(null, "Ingrese el monto que desea extraer:");
                otro = Double.parseDouble(cOtro);
                
                if (otro <= saldoGlobal) {
                    saldoGlobal = saldoGlobal - otro;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + saldoGlobal);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede retirar mas dinero del que tiene");
                }
                break;
            case 6:
                //Salir
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta");
        }
    }   
}
