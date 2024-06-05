
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado = 0;
        char operacion;

        System.out.println("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Seleccione una operación (+, -, *, /): ");
        operacion = scanner.next().charAt(0);

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}

