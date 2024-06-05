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
public class Alumnos {
   public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int n = cal.nextInt();

        double[] calificaciones = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación del alumno " + (i + 1) + ": ");
            calificaciones[i] = cal.nextDouble();
        }

        double promedio = calcularPromedio(calificaciones);

        System.out.println("El promedio de calificaciones es: " + promedio);
    } 

    private static double calcularPromedio(double[] calificaciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
