/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ler;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CrearArchivo {
    public void crearArchivo(){
        //create file
        try{
            FileOutputStream f= new FileOutputStream("archivo1.txt");
            DataOutputStream archivo = new DataOutputStream(f);
        } catch (FileNotFoundException ex){
            System.out.println("Existe un error: "+ex);

        }
        //write to file
        String nombre, direccion, telefono;
        FileWriter w;
        try{
        w = new FileWriter("archivo1.txt", true);
        PrintWriter wr = new PrintWriter(w); 
        for (int x =1; x <= 3; x++){
           nombre=(JOptionPane.showInputDialog("Nombre: \n" ));
           direccion=(JOptionPane.showInputDialog("Dirección: \n"));
           telefono=(JOptionPane.showInputDialog("Teléfono: \n"));
           wr.println(nombre+" "+ direccion+" "+telefono); 
        }
        wr.close();
        w.close();
    } catch (IOException ex){
        System.out.println("Existe un error: "+ex);
    }
   
}
} 

