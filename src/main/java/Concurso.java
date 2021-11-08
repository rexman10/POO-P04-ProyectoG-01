/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */

import java.util.ArrayList;
import java.util.Random;

public class Concurso {
    private String nombre;
    private String fecha;
    private String hora;
    private String fechaInicioInscrip;
    private String fehcaFinInscrip;
    private String ciudad;
    private String lugar;
    private String[] premios;
    private ArrayList<String> auspiciantesLista;
    private String dirigido;
    private String codigo;

    public Concurso(String nombre, String fecha, String hora, String fechaInicioInscrip, String fehcaFinInscrip, String ciudad, String lugar, String[] premios, ArrayList<String> auspiciantes, String dirigido) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.fechaInicioInscrip = fechaInicioInscrip;
        this.fehcaFinInscrip = fehcaFinInscrip;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.premios = premios;
        this.auspiciantesLista = auspiciantes;
        this.dirigido = dirigido;
        short x  = (short) (100*Math.random()+1);
        short y  = (short) (100*Math.random()+1);
        this.codigo = nombre.substring(0,2) + x + ciudad.substring(0,3) + y + lugar.substring(0,3);
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getFechaInicioInscrip() {
        return fechaInicioInscrip;
    }

    public String getFehcaFinInscrip() {
        return fehcaFinInscrip;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public String[] getPremios() {
        return premios;
    }

    public ArrayList<String> getAuspiciantesLista() {
        return auspiciantesLista;
    }

    public String getDirigido() {
        return dirigido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void inscribirParticipante(Dueño d, Mascota m){
        
    }
    
    public void administrarConcurso(){
        
    }
    
}
