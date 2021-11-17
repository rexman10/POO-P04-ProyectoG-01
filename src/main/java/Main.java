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
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main { 

    public static void inscribirParticipante(){

    }
    static Scanner todo = new Scanner(System.in);

    public static Premio crearPremio(){
        //Scanner premios = new Scanner(System.in);
        System.out.println("Ingrese el primer premio:");
        String p1 = todo.nextLine();
        System.out.println("Ingrese el segundo premio:");
        String p2 = todo.nextLine();
        System.out.println("Ingrese el tercer premio:");
        String p3 = todo.nextLine();
        Premio p = new Premio(p1, p2, p3);
        //premios.close();
        return p;
    }

    public static void crearConcurso(){
        //Scanner concursos = new Scanner(System.in);
        System.out.println("Ingrese el nombre del concurso:");
        String n = todo.nextLine();
        System.out.println("Ingrese la fecha del concurso(dd/mm/aaaa):");
        String linea = todo.nextLine();
        String[] datos = linea.split("/", 3);
        int dia = Integer.valueOf(datos[0]);
        int mes = Integer.valueOf(datos[1]);
        int anio = Integer.valueOf(datos[2]);
        Calendar f_evento = new GregorianCalendar(anio, mes, dia);
        System.out.println("Ingrese la hora del concurso:");
        String temp = todo.nextLine();
        int hora = Integer.valueOf(temp);
        System.out.println("Ingrese la fecha de inicio de inscripciones(dd/mm/aaaa):");
        String linea2 = todo.nextLine();
        String[] datos2 = linea.split("/", 3);
        int dia2 = Integer.valueOf(datos[0]);
        int mes2 = Integer.valueOf(datos[1]);
        int anio2 = Integer.valueOf(datos[2]);
        Calendar inicioInsc = new GregorianCalendar(anio2, mes2, dia2);
        System.out.println("Ingrese la fecha de fin de inscripciones(dd/mm/aaaa):");
        String linea3 = todo.nextLine();
        String[] datos3 = linea.split("/", 3);
        int dia3 = Integer.valueOf(datos[0]);
        int mes3 = Integer.valueOf(datos[1]);
        int anio3 = Integer.valueOf(datos[2]);
        Calendar finInsc = new GregorianCalendar(anio3, mes3, dia3);
        System.out.println("Las ciudades disponibles son: ");
        // falta poner las ciudades aqui
        System.out.println("Ingrese el lugar del evento:");
        String local = todo.nextLine();
        Premio p = crearPremio();
        System.out.println("Los auspiciantes disponibles son:");
        // falta poner los auspiciantes aqui
        System.out.println("A quien estara dirigido el concurso?\nPerros (1)\nGatos (2)\nTodos (3)\nDirigido a: ");
        System.out.println(todo.hasNextLine());
        int entry = todo.nextInt();
        switch (entry) {
            case 1:
                String perr = "Perros";
                break;
            case 2:
                String gat = "Gatos";
                break;
            case 3:
                String tod = "Todos";
                break;
        }
        //concursos.close();
        //Concurso c = new Concurso(n, f_evento, hora, inicioInsc, finInsc, ciudad, local, p, auspiciantes, entry);
        //return c;
    }

    public static void administrarConcurso(){
        System.out.println("------------------Concursos------------------\nCrear concurso (1)\nInscribir participante (2)\nEliga una de las opciones del menu Concursos:");
        //Scanner input = new Scanner(System.in);
        int entrada_user = todo.nextInt();
        todo.nextLine();
        switch (entrada_user) {
            case 1:
                crearConcurso();
                todo.nextLine();
                break;

            case 2:
                inscribirParticipante();
                todo.nextLine();
                break;

            default:
                break;
        }
        //input.close();

    }

    public static void menuPrincipal(){
        System.out.println("------------------Menu Principal------------------\nAdministrar concursos (1)\nAdministrar dueños (2)\nAdministrar mascotas (3)\nEliga una de las opciones del menu Concursos:");
        //Scanner menu = new Scanner(System.in);
        int seleccion = todo.nextInt();
        switch (seleccion) {
            case 1:
                Main.administrarConcurso();
                break;
            //case 2:
            //    Main.administrarDueños();
            //    break;
            //case 3:
            //    Main.administrarMascotas();
            //    break;
        }
        //menu.close();
    }
    public static void main(String[] args){
        //Ciudad prueba = new Ciudad("Guayaquil", "Guayas");
        //System.out.println(prueba.getProvincia());
        //System.out.println(prueba.getCodigo());

        Ciudad Quito = new Ciudad("Quito", "Pichincha");
        Ciudad Guayaquil = new Ciudad("Guayaquil", "Guayas");
        Ciudad Cuenca = new Ciudad("Cuenca","Azuay");
        //ArrayList<Ciudad> listaCiudades = new ArrayList<>();
        //listaCiudades.add(Quito);
        //listaCiudades.add(Guayaquil);
        //listaCiudades.add(Cuenca);
        //System.out.println(Ciudad.listaCiudades);

        menuPrincipal();

        Auspiciante auspiciante1 = new Auspiciante("dogchow", "calle1", "0959501881",Quito, "algo@gmial.com", "www.dogchow.com");

        Premio premio_c1 = new Premio("200 dolares", "100 dolares", "50 dolares", auspiciante1);

        Calendar fechaEvento = new GregorianCalendar(2021, Calendar.NOVEMBER, 7);
        Calendar inicioInscrip = new GregorianCalendar(2021, Calendar.OCTOBER, 25);
        Calendar finInscrip = new GregorianCalendar(2021, Calendar.NOVEMBER, 2);
        Concurso c1  = new Concurso("Top Mascotas",fechaEvento,16,inicioInscrip,finInscrip,Quito,"Estadio local",premio_c1,auspiciante1,"Todos");


        Calendar fc2 = new GregorianCalendar(2021, Calendar.NOVEMBER, 30);
        Calendar fin2 = new GregorianCalendar(2021, Calendar.NOVEMBER, 15);
        Calendar ffin2 = new GregorianCalendar(2021, Calendar.NOVEMBER, 25);
        Concurso c2 = new Concurso("Firulais", fc2, 20, fin2, ffin2, Cuenca, "Casa comunal", premio_c1, auspiciante1, "Perros");
        
        System.out.println(c1.getPremios());

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

        //d1.editarDueño();

        System.out.println(d1);

        //c1.inscribirParticipante(d, m);
        //implementar la inscripcion de nuevos dueños con sus mascotas
    }
}
