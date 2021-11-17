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
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args){
        //Ciudad prueba = new Ciudad("Guayaquil", "Guayas");
        //System.out.println(prueba.getProvincia());
        //System.out.println(prueba.getCodigo());
        
        
        Ciudad Quito = new Ciudad("Quito", "Pichincha");

        Ciudad Guayaquil = new Ciudad("Guayaquil", "Guayas");

        Ciudad Cuenca = new Ciudad("Cuenca","Azuay");

        Auspiciante auspiciante1 = new Auspiciante("dogchow", "calle1", "0959501881", Quito, "algo@gmial.com", "www.dogchow.com");

        Premio premio1 = new Premio("200 dolares", "100 dolares", "50 dolares", auspiciante1);

        Dueño d1 = new Dueño("0952645646", "Juan Alejandro", "Guadalupe Rosas", "Urb. La Romareda", "0959452918", Quito, "jaguadal@espol.edu.ec");

        System.out.println(d1);

        Calendar fechaEvento = new GregorianCalendar(2021, Calendar.NOVEMBER, 7);

        Calendar inicioInscrip = new GregorianCalendar(2021, Calendar.OCTOBER, 25);

        Calendar finInscrip = new GregorianCalendar(2021, Calendar.NOVEMBER, 2);

        Concurso c1  = new Concurso("Top Mascotas",fechaEvento,"16h00",inicioInscrip,finInscrip,Quito,"Estadio local",premio1,auspiciante1,"perros");
        
        System.out.println(c1.getPremios());
        
        ArrayList<Ciudad> listaCiudades = new ArrayList<>();
        listaCiudades.add(Quito);
        listaCiudades.add(Guayaquil);
        listaCiudades.add(Cuenca);

        ArrayList<Auspiciante> listaAuspiciantes = new ArrayList<>();
        listaAuspiciantes.add(auspiciante1);

        ArrayList<Concurso> listadoConcursos = new ArrayList<>();
        listadoConcursos.add(c1);

        ArrayList<Dueño> listaDueños = new ArrayList<>();
        listaDueños.add(d1);

        ArrayList<Mascota> listaMascotas = new ArrayList<>();
        listaMascotas.add(m1);
        listaMascotas.add(m2);
        listaMascotas.add(m3);
        listaMascotas.add(m4);
        listaMascotas.add(m5);
        listaMascotas.add(m6);
        listaMascotas.add(m7);
        listaMascotas.add(m8);
        listaMascotas.add(m9);
        listaMascotas.add(m10);



        d1.editarDueño();

        System.out.println(d1);
        
        
        
        
        //c1.inscribirParticipante(d, m);
        //implementar la inscripcion de nuevos dueños con sus mascotas
    }
}
