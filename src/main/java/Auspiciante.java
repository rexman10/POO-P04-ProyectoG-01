/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Auspiciante {
    private String nombre;
    private String direccion;
    private String telefono;
    private Ciudad ciudad;
    private String email;
    private String webPage;
    private String codigo;

    public Auspiciante(String nombre, String direccion, String telefono, Ciudad ciudad, String email, String webPage) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.email = email;
        this.webPage = webPage;
    }
    
    
}
