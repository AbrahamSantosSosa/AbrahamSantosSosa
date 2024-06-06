/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

/**
 *
 * @author Usuario
 */
public class EmpleadoAdministrativo extends Persona {
    float sueldobase, isr;

    public void altaTrabajador(String nombre, String domicilio, String telefono, 
    String curp, String rfc, int edad, float sueldobase, float sueldoneto, float isr){
      super.nombre=nombre;
      super.domicilio=domicilio;
      super.telefono=telefono;  
      super.curp=curp;
      super.rfc=rfc;
      super.edad=edad;
      this.sueldobase=sueldobase;
      super.sueldoneto=sueldoneto;
      this.isr=isr;
    }
    //Practica 6 (Se esta sobreescribiendo el metodo listarDatos)
    public float CalculodeSueldoNeto(float sueldobase, float isr){
      this.sueldobase=sueldobase;
      this.isr=isr;
      this.sueldoneto=sueldobase-isr;
      return sueldoneto;
    }
    
}

