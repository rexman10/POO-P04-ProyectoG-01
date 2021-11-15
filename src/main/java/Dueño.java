import java.util.ArrayList;
import java.util.Scanner;

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

    public String toString(){
        return "El dueño " + this.getNombres() + " con cedula " + this.getCedula() + " vive en " + this.getDireccion() + ". " + "Contacto: " + this.getTelefono();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
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

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void editarDueño(){
        System.out.println("Desea editar los datos del dueño: " + this.getNombres() + " con cedula de identidad: " + this.getCedula() + "? (S/N)");
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        if (entrada.equals("S")) {
            Scanner textos = new Scanner(System.in);
            System.out.println("Ingrese la nueva direccion:");
            String direccion_nueva = textos.nextLine();
            this.setDireccion(direccion_nueva);
            System.out.println("Ingrese el nuevo numero de telefono:");
            String tel_nuevo = textos.nextLine();
            this.setTelefono(tel_nuevo);
            //System.out.println("Ciudades disponibles:");
            //for (Ciudad c : lciudades) {
            //    System.out.println(c);
            //}
            //System.out.println("Desea agregar una nueva ciudad? (S/N)");
            //Scanner cities = new Scanner(System.in);
            //String decision = cities.nextLine();
            //if (decision == "S") {
            //    System.out.println("Ingrese el nombre de la nueva ciudad:");
            //   String nueva_ciudad = cities.nextLine();
            //    System.out.println("Ingrese el nombre de la nueva provincia");
            //    String nueva_provincia = cities.nextLine();
            //    Ciudad ciudad = new Ciudad(nueva_ciudad,nueva_provincia);
            //
            //}
            //else if (decision == "N") {
            //    System.out.println("Eliga una de las ciudades de la lista:");
            //    String ciudad_reemplazo = cities.nextLine();
            //    d.ciudad = ;
            //}
            System.out.println("Ingrese el nuevo email: ");
            String nuevo_email = textos.nextLine();
            this.setEmail(nuevo_email);

            textos.close();
        }
        if (entrada.equals("N")){
            System.out.println("No se ha editado ningun dueño");
        }
        input.close();
    }
    
}
