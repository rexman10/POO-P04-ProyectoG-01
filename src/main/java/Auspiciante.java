/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Auspiciante extends Persona{
    private String email;
    private String webPage;
    private String codigo;

    public Auspiciante(String nombre, String direccion, String telefono, Ciudad ciudad, String email, String webPage) {
        super(nombre,direccion,telefono,ciudad);
        this.email = email;
        this.webPage = webPage;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public String getEmail() {
        return email;
    }

    public String getWebPage() {
        return webPage;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
}
