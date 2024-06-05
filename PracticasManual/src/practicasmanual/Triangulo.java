/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasmanual;

/**
 *
 * @author Usuario
 */
public class Triangulo {
    double base;
    double altura;
    String nombre;
public Triangulo(String nombre, double base, double altura){
    String(nombre, base);
    this.base = base;
    this.altura = altura;
}
public Triangulo(){
    super();
    System.out.println("Se creo un triangulo");
}
    public void area(){
        double area = (base * altura)/2;
        System.out.println("El area del triangulo es: "+area);
    }

    private void String(String nombre, double base) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void DibujarFigura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

