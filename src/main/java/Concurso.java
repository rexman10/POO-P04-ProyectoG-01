/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Concurso {
    private String nombre;
    private String fecha;
    private int hora;
    private String fechaInicioInscrip;
    private String fehcaFinInscrip;
    private Ciudad ciudad;
    private String lugar;
    private String premios[];
    private Auspiciante auspiciantes[];
    private String dirigido;
    private String codigo;

    public Concurso(String nombre, String fecha, int hora, String fechaInicioInscrip, String fehcaFinInscrip, Ciudad ciudad, String lugar, String[] premios, Auspiciante[] auspiciantes, String dirigido) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.fechaInicioInscrip = fechaInicioInscrip;
        this.fehcaFinInscrip = fehcaFinInscrip;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.premios = premios;
        this.auspiciantes = auspiciantes;
        this.dirigido = dirigido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public String getFechaInicioInscrip() {
        return fechaInicioInscrip;
    }

    public String getFehcaFinInscrip() {
        return fehcaFinInscrip;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public String[] getPremios() {
        return premios;
    }

    public Auspiciante[] getAuspiciantes() {
        return auspiciantes;
    }

    public String getDirigido() {
        return dirigido;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void inscribirParticipante(Dueño d, Mascota m){
        
    }
}
