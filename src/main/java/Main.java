/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Ciudad prueba = new Ciudad("Guayaquil", "Guayas");
        //System.out.println(prueba.getProvincia());
        //System.out.println(prueba.getCodigo());
        
        Scanner input_texto = new Scanner(System.in);
        String[] arreglo = new String[3];
        
        for (int i=0; i < 3; i++) {
            System.out.println("Ingrese el " + (i+1) + " premio");
            String dato = input_texto.nextLine();
            arreglo[i] = dato;
        }
        
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Dog Chow");
        lista.add("caninos");
        
        Concurso c1  = new Concurso("Top Mascotas","7 Nov","16h00","25 Oct","2 Nov","Quito","Estadio local",arreglo,lista,"perros");
        
    }
}
