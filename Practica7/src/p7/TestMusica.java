/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

/**
 *
 * @author Usuario
 */
public class TestMusica {
   public static void main(String[] args) {
        //Objeto miGuitarra de tipo Instrumento
        Guitarra miGuitarra = new Guitarra();
        System.out.println("Instrumento: "+miGuitarra.tipodeinstrumento);
        miGuitarra.tocarInstrumento();
        System.out.println();
        //Objeto miSaxofon de tipo Instrumento
        InstrumentosMusicales miPiano= new Piano();
        System.out.println("Instrumento: "+miPiano.tipodeinstrumento);
        miPiano.tocarInstrumento();
        System.out.println();
        //Objeto miViolin de tipo Instrumento
        Violin miViolin = new Violin();
        System.out.println("Instrumento : " + miViolin.tipodeinstrumento);
        miViolin.tocarInstrumento();
    }
    
} 

