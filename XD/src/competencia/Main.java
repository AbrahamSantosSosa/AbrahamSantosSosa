/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia;

/**
 *
 * @author Usuario
 */
public class Main {

    private static String Juan;
    public static void main(String[] args) throws Exception {
        Atletismo a1 = new Atletismo();
        a1.prueba = "100 m";
        a1.tiempoGanadorr = "10.0";
        a1.segundoLugar = "Juan";
        
        System.out.println("Atletismo");
        System.out.println("La prueba es  "+ a1.getPrueba());
        System.out.println("El tiempo del ganador de las prueba es 100 " + a1.getTiempoGanador());
        System.out.println("El segundo lugar de la prueba es " + a1.getSegundoLugar());
        System.out.println("El tiempo del segundo lugar es " +a1.getTiempo2doLugar());
        System.out.println("El ganador del tercer lugar es " + a1.getTercerLugar());
        System.out.println("El nuevo record panamericano  es de " + a1.getTiempoGanador());
    }
 
}
