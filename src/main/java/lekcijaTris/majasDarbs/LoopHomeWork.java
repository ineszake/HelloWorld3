package lekcijaTris.majasDarbs;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class LoopHomeWork {
    public static void main(String[] args) {

//1.uzdevums
        int x = 23;
        while (x < 100) {
            System.out.println(x);
            x++;
        }
        System.out.println("Gatavs");

        //2.uzdevums
        String [] drebes= {"mētelis","blūze","mētelis","svārki"};
        int y=0;
        while (y < drebes.length){
            System.out.println(drebes [y]);
            y++;
        }
        String [] drebes2= {"mētelis","blūze","mētelis","svārki"};
        for (int a = 0; a < 4; a++) {
            System.out.println("cikls izpildās"  + drebes2 [a]);
        }
        int c=0;
        do {
            System.out.println(drebes2 [c]);
            c++;
        } while (c<4);

        int[] salasitasColoradoVabolesPaPiecamDienam ={12,34,54,32,13};
        int h=0;
        while (h>5){
            System.out.print(salasitasColoradoVabolesPaPiecamDienam[h]);
            h++;
        }

        int m=0;
        do {
            System.out.println(salasitasColoradoVabolesPaPiecamDienam[m]);
            m++;

        } while (m>5);


        for (int l = 0; l < 5; l++) {
            System.out.println(salasitasColoradoVabolesPaPiecamDienam [l]);

        }

        char[] sunaVards = {'D','ž','o','n','i','s'};         for (char burts: sunaVards){
            System.out.print(burts);         }



    }
}
