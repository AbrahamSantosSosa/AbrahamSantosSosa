/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasmanual;

/**
 *
 * @author Usuario
 */
public class Circulo {
    float radio;
    String nombre;
    public void Area(){
        System.out.println("Método para calcular área de un circulo");
        double area = Math.PI*Math.pow(radio,2);
        System.out.println("El area del Circulo es"+ area);
        
    }
    public void DibujarFigura(){
        System.out.println("Método para dibujar un Circulo");
    }
    }

