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
public class Figura {
   String nombre;
    double area;
    
    public void Area(){
        System.out.println("El area de la figura "+nombre+" es: "+area);
    }
    public void DibujarFigura(){
        System.out.println("Dibujando figura "+nombre);
    }
} 

