package lekcijaTris.labDarbs;

import java.util.Scanner;

public class Main {
    Scanner ievade = new Scanner(System.in);
    int number = ievade.nextInt();
    public static void main(String[] args) {







        int[] montlyCost = {100, 43, 56, 67, 55, 150};
        String[] produktuSaraksts = {" piens", " maize", " krējums"};
        System.out.println(produktuSaraksts[0]);
        System.out.println(produktuSaraksts[1]);
        System.out.println(produktuSaraksts[2]);
        System.out.println(montlyCost[4]);

        produktuSaraksts[2] = "Krējums";
        System.out.println(produktuSaraksts[2]);

        String[] cars = {"Volvo", "BMW", "Porsche"};
        System.out.println("Masiva garums ir:" + cars.length);
        cars[1] = "Audi";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);

        int[] menesiGada = new int[12];
        menesiGada[0] = 1;


        int x = 5;
        while (x > 0) ;
        {
            System.out.println("x nav nulle, x=" + x);
            x = x - 1;
        }

        int i = 10;
        while (i < 50) ;
        {
            System.out.println(" I ir" + i);
            i++;
        }// tas pats kas i=i+1

        String[] cars2 = {"Volvo", "BMW", "Porsche", "AUDI"};
        int z = 0;
        while (z < cars2.length) ;
        {
            System.out.println(cars[z]);
            z = z + 1;
        }
        int k = 15;
        while (k > 0) ;
        {
            System.out.println("k ir" + k);
        }





        String[] kartis = {"Pīķa dūzis", " Ercena kalps", " Kreiča dāma"};
        int m = 0;
        while (m < kartis.length) ;
        {
            System.out.println(m < kartis.length);
            m++;
        }
        int q = 1;
        do {
            System.out.println("test test test");
            q++;
        } while (q < 10);



        long[] telefonNumuri = {222222, 3333333, 44444444, 5555555, 543543543};
        for (long numurs : telefonNumuri) {
            System.out.println(numurs);
        }





        }



        }







