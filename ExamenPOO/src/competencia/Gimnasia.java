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
public class Gimnasia extends Individual {
    String prueba, juezArbitro, juezArbitroSalida, juecesLlegada, juecesAuxiliares, cronometradores;
    int hits;
    float tiempoGanador, tiempo2doLugar, tiempo3erLugar;

    public Gimnasia() {
    }

    public Gimnasia(String prueba, String juezArbitro, String juezArbitroSalida, String juecesLlegada, String juecesAuxiliares, String cronometradores, int hits, float tiempoGanador, float tiempo2doLugar, float tiempo3erLugar, String disciplina, String rama, String categoria, String fecha, String hora, String ganador, String segundoLugar, String tercerLugar, String etapa, String sede, String recordMundial, String recordPanamericano, String observaciones) {
        super(disciplina, rama, categoria, fecha, hora, ganador, segundoLugar, tercerLugar, etapa, sede, recordMundial, recordPanamericano, observaciones);
        this.prueba = prueba;
        this.juezArbitro = juezArbitro;
        this.juezArbitroSalida = juezArbitroSalida;
        this.juecesLlegada = juecesLlegada;
        this.juecesAuxiliares = juecesAuxiliares;
        this.cronometradores = cronometradores;
        this.hits = hits;
        this.tiempoGanador = tiempoGanador;
        this.tiempo2doLugar = tiempo2doLugar;
        this.tiempo3erLugar = tiempo3erLugar;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getJuezArbitro() {
        return juezArbitro;
    }

    public void setJuezArbitro(String juezArbitro) {
        this.juezArbitro = juezArbitro;
    }

    public String getJuezArbitroSalida() {
        return juezArbitroSalida;
    }

    public void setJuezArbitroSalida(String juezArbitroSalida) {
        this.juezArbitroSalida = juezArbitroSalida;
    }

    public String getJuecesLlegada() {
        return juecesLlegada;
    }

    public void setJuecesLlegada(String juecesLlegada) {
        this.juecesLlegada = juecesLlegada;
    }

    public String getJuecesAuxiliares() {
        return juecesAuxiliares;
    }

    public void setJuecesAuxiliares(String juecesAuxiliares) {
        this.juecesAuxiliares = juecesAuxiliares;
    }

    public String getCronometradores() {
        return cronometradores;
    }

    public void setCronometradores(String cronometradores) {
        this.cronometradores = cronometradores;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public float getTiempoGanador() {
        return tiempoGanador;
    }

    public void setTiempoGanador(float tiempoGanador) {
        this.tiempoGanador = tiempoGanador;
    }

    public float getTiempo2doLugar() {
        return tiempo2doLugar;
    }

    public void setTiempo2doLugar(float tiempo2doLugar) {
        this.tiempo2doLugar = tiempo2doLugar;
    }

    public float getTiempo3erLugar() {
        return tiempo3erLugar;
    }

    public void setTiempo3erLugar(float tiempo3erLugar) {
        this.tiempo3erLugar = tiempo3erLugar;
    }

    public String getRecordMundial() {
        return recordMundial;
    }

    public void setRecordMundial(String recordMundial) {
        this.recordMundial = recordMundial;
    }

    public String getRecordPanamericano() {
        return recordPanamericano;
    }

    public void setRecordPanamericano(String recordPanamericano) {
        this.recordPanamericano = recordPanamericano;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
