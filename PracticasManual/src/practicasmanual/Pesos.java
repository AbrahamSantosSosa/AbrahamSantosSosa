/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasmanual;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pesos {
  Scanner pesos = new Scanner(System.in);
 float p,b,h;
 public static void main(String[] args) {
 float p,b,h;
 Scanner pesos = new Scanner(System.in);
      
   System.out.println("Ingresa los pesos a convertir a dolares");
        p = pesos.nextFloat();
        System.out.println("Tus "+p+" son "+Convertir(p)+"dolaes");  
      System.out.println("Ingresa la base");
        b = pesos.nextFloat();  
        System.out.println("Ingresa la altura");
        h = pesos.nextFloat();   
        System.out.println("El area del triangulo es "+Area(b,h));
    }

    
    public static float Convertir(float pesos) { float dolares = (float) (pesos / 17.60);

    return dolares;
    }
  
    public static float Area(float base, float altura){
    float area = (base*altura)/2;
    return area;
    }   
}
