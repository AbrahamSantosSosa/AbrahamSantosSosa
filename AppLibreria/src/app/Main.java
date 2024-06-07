/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {
   public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\nMenú de Biblioteca");
            System.out.println("1. Agregar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    Libro libro = new Libro(titulo, autor, isbn);
                    biblioteca.agregarLibro(libro);
                    System.out.println("Libro agregado con éxito.");
                    break;
                case 2:
                    System.out.println("Libros en la biblioteca:");
                    for (Libro l : biblioteca.listarLibros()) {
                        System.out.println(l);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el título del libro a buscar: ");
                    String tituloBusqueda = scanner.nextLine();
                    Libro libroBuscado = biblioteca.buscarLibroPorTitulo(tituloBusqueda);
                    if (libroBuscado != null) {
                        System.out.println("Libro encontrado: " + libroBuscado);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        
        scanner.close();
    }
} 

