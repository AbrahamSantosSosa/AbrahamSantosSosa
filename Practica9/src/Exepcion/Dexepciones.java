/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepcion;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Dexepciones {
        public static void main(String[] args) {
        int a, b, resultado;
        while (true) {
            a=Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));
            b=Integer.parseInt(JOptionPane.showInputDialog("Teclea el númerador"));
            try{
                resultado=b / a; 
                JOptionPane.showMessageDialog(null, "Resultado = "+ resultado);
                JOptionPane.showMessageDialog(null, "Programa Terminado");
                System.exit(0);
            } catch(ArithmeticException e){
                
                JOptionPane.showMessageDialog(null, "Intento de dividir entre cero, teclea nuevamente los valores");
            }

            
        }
    }
    
}

