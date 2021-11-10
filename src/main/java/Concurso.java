/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */

import java.util.Calendar;

public class Concurso {
    private String nombre;
    private Calendar fecha;
    private String hora;
    private Calendar fechaInicioInscrip;
    private Calendar fehcaFinInscrip;
    private Ciudad ciudad;
    private String lugar;
    private Premio premios;
    private Auspiciante auspiciante;
    private String dirigido;
    private String codigo;

    public Concurso(String nombre, Calendar fecha, String hora, Calendar fechaInicioInscrip, Calendar fehcaFinInscrip, Ciudad ciudad, String lugar, Premio premios, Auspiciante auspiciantes, String dirigido) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.fechaInicioInscrip = fechaInicioInscrip;
        this.fehcaFinInscrip = fehcaFinInscrip;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.premios = premios;
        this.auspiciante = auspiciantes;
        this.dirigido = dirigido;
        short x  = (short) (100*Math.random()+1);
        short y  = (short) (100*Math.random()+1);
        this.codigo = nombre.substring(0,2) + x + ciudad.toString().substring(0,3) + y + lugar.substring(0,3);
    }

    public String getNombre() {
        return nombre;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Calendar getFechaInicioInscrip() {
        return fechaInicioInscrip;
    }

    public Calendar getFehcaFinInscrip() {
        return fehcaFinInscrip;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public Premio getPremios() {
        return premios;
    }

    public Auspiciante getAuspiciantesLista() {
        return auspiciante;
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
