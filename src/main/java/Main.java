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

        Dueño d1 = new Dueño("0952645646", "Juan Alejandro", "Guadalupe Rosas", "Urb. La Romareda", "0959452918", Quito, "jaguadal@espol.edu.ec");
        Dueño d2 = new Dueño("0929548980", "Christofer Paul", "Espin Huayamabe", "Pradera 2", "0995725182", Guayaquil, "cpespin@espol.edu.ec");
        Dueño d3 = new Dueño("0924452625", "Victor Enrique", "Suarez Suarez", "El Batán", " 0985677532", Cuenca, "vistop_schultz69@gmail.com");
        Dueño d4 = new Dueño("0935827528", "David Emiliano", "Rosselló Higueras", "Cañaribamba", "0934216226", Cuenca, "ejemplo4@gmail.com");
        Dueño d5 = new Dueño("0927482472", "Miguel Paul", "Batlle Rozas", "Guasmo Norte", "0940106033", Guayaquil, "ejemplo5@gmail.com");
        Dueño d6 = new Dueño("0916482748", "Jose Manuel", "Escribano Juliá", "Cotocollao", "0953006438", Quito, "ejemplo6@gmail.com");
        Dueño d7 = new Dueño("0918392840", "Jose Daniel", "Robledo-Aguirre", "Totoracocha", "0913441009", Cuenca, "ejemplo7@gmail.com");
        Dueño d8 = new Dueño("0914272194", "Antonio Jesus", "Quevedo-Pera", "Barrio Cuba", "0953006438", Guayaquil, "ejemplo8@gmail.com");
        Dueño d9 = new Dueño("0982837282", "Abraham Orlando", "Hernandez Calzada", "Yanuncay", "0960704725", Cuenca, "ejemplo9@gmail.com");
        Dueño d10 = new Dueño("0928493859", "Jose Juan", "Sebastián Vazquez", "Urdesa", "0976082153", Guayaquil, "ejemplo10@gmail.com");

        listaDueños.add(d1);
        listaDueños.add(d2);
        listaDueños.add(d3);
        listaDueños.add(d4);
        listaDueños.add(d5);
        listaDueños.add(d6);
        listaDueños.add(d7);
        listaDueños.add(d8);
        listaDueños.add(d9);
        listaDueños.add(d10);


        ArrayList<Mascota> listaMascotas = new ArrayList<>();

        Mascota m1 = new Mascota("fifi", "gato", "persa", "25-12-2017", "f1", d1);
        Mascota m2 = new Mascota("coco", "perro", "labrador", "15-02-2016", "f2", d2);
        Mascota m3 = new Mascota("max", "perro", "golden retriever", "20-05-2016", "f3", d3);
        Mascota m4 = new Mascota("rocky", "gato", "siames", "30-12-2019", "f4", d4);
        Mascota m5 = new Mascota("toby", "perro", "chihuahua", "20-10-2018", "f5", d5);
        Mascota m6 = new Mascota("simba", "gato", "ragdoll", "15-11-2019", "f6", d6);
        Mascota m7 = new Mascota("leo", "gato", "bengala", "10-04-2020", "f7", d7);
        Mascota m8 = new Mascota("lucas", "perro", "caniche", "05-06-2012", "f8", d8);
        Mascota m9 = new Mascota("zeus", "perro", "poodle", "01-07-2014", "f9", d9);
        Mascota m10 = new Mascota("bruno", "gato", "munchkin", "01-09-2018", "f10", d10);

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
