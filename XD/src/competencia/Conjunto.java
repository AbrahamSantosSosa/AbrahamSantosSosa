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
public class Conjunto extends Competencia{
    String asistencias, faltas, marcador;

    public Conjunto() {
    }

    public Conjunto(String asistencias, String faltas, String marcador, String disciplina, String rama, String categoria, String fecha, String hora, String ganador, String segundoLugar, String tercerLugar, String etapa, String sede) {
        super(disciplina, rama, categoria, fecha, hora, ganador, segundoLugar, tercerLugar, etapa, sede);
        super.disciplina = disciplina;
        super.rama = rama;
        super.categoria = categoria;
        super.fecha = fecha;
        super.hora = hora;
        super.ganador = ganador;
        super.segundoLugar = segundoLugar;
        this.asistencias = asistencias;
        this.faltas = faltas;
        this.marcador = marcador;
    }

    public String getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(String asistencias) {
        this.asistencias = asistencias;
    }

    public String getFaltas() {
        return faltas;
    }

    public void setFaltas(String faltas) {
        this.faltas = faltas;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
    
}
