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
public class Rectangulo {
    double lado;
    float base, altura;
    String nombre;
    public void Area(){
        System.out.println("Método para calcular área de un Rectangulo es"); 
        float area = base * altura;
        System.out.println("El área del Rectángulo es "+ area);   
    }
    public void DibujarFigura(){
        System.out.println("Método para dibujar un Rectangulo");
    }
    }
     

