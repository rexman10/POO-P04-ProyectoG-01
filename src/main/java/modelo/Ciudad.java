package modelo;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Ciudad {
    private String nombre;
    private String provincia;
    private String codigo;
    
    public String getNombre() {
        return nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public String toString(){
        return this.getNombre();
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;            
        }
        if (obj != null && obj instanceof Ciudad) {
            Ciudad comparacion = (Ciudad) obj;
            return nombre.equals(comparacion.nombre);       
        }
        return false;
    }

    public Ciudad(String nombre, String provincia) {
        short x  = (short) (100*Math.random()+1);
        this.nombre = nombre;
        this.provincia = provincia;
        this.codigo = nombre.substring(0, 2).toUpperCase() + x + provincia.substring(1,3).toUpperCase();
        
    }

}
