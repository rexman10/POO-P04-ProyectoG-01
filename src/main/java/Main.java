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
        
        
        Ciudad ciudad1 = new Ciudad("Quito", "Pichincha");

        Auspiciante auspiciante1 = new Auspiciante("dogchow", "calle1", "0959501881", ciudad1, "algo@gmial.com", "www.dogchow.com");

        Premio premio1 = new Premio("200 dolares", "100 dolares", "50 dolares", auspiciante1);

        Calendar fechaEvento = new GregorianCalendar(2021, Calendar.NOVEMBER, 7);

        Calendar inicioInscrip = new GregorianCalendar(2021, Calendar.OCTOBER, 25);

        Calendar finInscrip = new GregorianCalendar(2021, Calendar.NOVEMBER, 2);

        Concurso c1  = new Concurso("Top Mascotas",fechaEvento,"16h00",inicioInscrip,finInscrip,ciudad1,"Estadio local",premio1,auspiciante1,"perros");
        
        System.out.println(c1.getPremios());

        //c1.inscribirParticipante(d, m);
        //implementar la inscripcion de nuevos dueños con sus mascotas
    }
}
