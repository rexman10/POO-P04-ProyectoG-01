/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Dueño {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private Ciudad ciudad;
    private String email;

    public Dueño(String cedula, String nombres, String apellidos, String direccion, String telefono, Ciudad ciudad, String email) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.email = email;
    }
    
    
}
