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
    public static int contador = 0;

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
    
    public Ciudad(String nombre, String provincia) {
        short x  = (short) (100*Math.random()+1);
        this.nombre = nombre;
        this.provincia = provincia;
        this.codigo = nombre.substring(0, 2) + x + provincia.substring(1,3);
        Ciudad.contador +=1;
    }
    
    
}
