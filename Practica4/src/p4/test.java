/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class test {
   public static void main(String[] args) {
String nombre="", apellidopaterno="", apellidomaterno="", sexo="", direccion="";
int edad=0;
//creamos dos objetos de la clase Alumno
Alumno A1= new Alumno();
Alumno A2= new Alumno();
int na;
Scanner tec= new Scanner(System.in);
//Capturamos los datos de cada alumno
for(int x=1;x<=2;x++){
System.out.println("Nombre del Alumno: " +x);
nombre=tec.nextLine();
System.out.println("Apellido Paterno:");
apellidopaterno=tec.nextLine();
System.out.println("Apellido Materno:");
apellidomaterno=tec.nextLine();
System.out.println("Sexo: ");
sexo=tec.nextLine();
System.out.println("Dirección: ");
direccion=tec.nextLine();
System.out.println("Edad: ");
edad=tec.nextInt();
/*Mandamos llamar el método para asignar los valores
capturados a variables de instancia */ 
A1.altaAlumnos(nombre, apellidopaterno, apellidomaterno, sexo, direccion, edad);
// Llamamos al método para listar los datos del alumno
A1.listarDatos();
}
}

    private static class Alumno {

        public Alumno() {
        }

        private void altaAlumnos(String nombre, String apellidopaterno, String apellidomaterno, String sexo, String direccion, int edad) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void listarDatos() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
} 

