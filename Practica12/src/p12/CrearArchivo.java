/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p12;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Usuario
 */
public class CrearArchivo {
   public void crearArchivo(){
      try{
        FileOutputStream f = new FileOutputStream("agenda.dat");
        DataOutputStream archivo = new DataOutputStream(f);

      }catch(FileNotFoundException e){
        System.out.println("No se pudo crear el archivo");
 
      }

}
} 

