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
public class Futbol extends Conjunto {
String Goles, Corners, Offsides;

    public Futbol() {
    }

    public Futbol(String Goles, String Corners, String Offsides, String asistencias, String faltas, String marcador, String disciplina, String rama, String categoria, String fecha, String hora, String ganador, String segundoLugar, String tercerLugar, String etapa, String sede) {
        super(asistencias, faltas, marcador, disciplina, rama, categoria, fecha, hora, ganador, segundoLugar, tercerLugar, etapa, sede);
        super.disciplina = disciplina;
        super.rama = rama;
        super.categoria = categoria;
        super.fecha = fecha;
        super.hora = hora;
        super.ganador = ganador;
        super.segundoLugar = segundoLugar;
        super.asistencias = asistencias;
        super.faltas = faltas;
        super.marcador = marcador;
        this.Goles = Goles;
        this.Corners = Corners;
        this.Offsides = Offsides;
    }

    public String getGoles() {
        return Goles;
    }

    public void setGoles(String Goles) {
        this.Goles = Goles;
    }

    public String getCorners() {
        return Corners;
    }

    public void setCorners(String Corners) {
        this.Corners = Corners;
    }

    public String getOffsides() {
        return Offsides;
    }

    public void setOffsides(String Offsides) {
        this.Offsides = Offsides;
    }
    public void NvoRecordMundial() {
        System.out.println("Goles del partido");
    }

    public void NvoRecordPanam() {
        System.out.println("Corners del partido");
    }

    public void setDatosPrueba() {
        System.out.println("Offsides del partido");
    }

    
}
