/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ler;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App {
    public static void main(String[] args) {
     Scanner tec = new Scanner(System.in);
     System.out.println("------Opciones-------");
     System.out.println("1. Crear Archivo");
     System.out.println("2. Leer Archivo");
     System.out.println("3. Salir");
     System.out.println("Seleccione una opción: ");
     int opcion = tec.nextInt();
        switch(opcion){
            case 1:
                CrearArchivo ca = new CrearArchivo();
                ca.crearArchivo();
                break;
            case 2:
                LeerArchivo la = new LeerArchivo();
                la.leerArchivo();
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        tec.close();
 }
}

