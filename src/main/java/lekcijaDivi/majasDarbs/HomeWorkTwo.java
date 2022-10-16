package lekcijaDivi.majasDarbs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
     //a
        int x=19;
        System.out.println(x>0);

        //b
        System.out.println(x<0);
        //c
        x=10;
        System.out.println(x>5 && x<=10);
        //d
        x=6;
        System.out.println (x!=5|| x>5 && x<10);
        //e
        x=8;
        System.out.println(x==0 || x==10);
        //f
        x=8;
        System.out.println(x*x>10);

        //2.uzdevums
        int monthNumber=8;
        String result;
        switch(monthNumber) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;case 3:
                System.out.println("Marts");
                break;case 4:
                System.out.println("Aprīlis");
                break;case 5:
                System.out.println("Maijs");
                break;case 6:
                System.out.println("Jūnijs");
                break;case 7:
                System.out.println("Jūlijs");
                break;case 8:
                System.out.println("Augusts");
                break;case 9:
                System.out.println("Septembris");
                break;case 10:
                System.out.println("Oktobris");
                break;case 11:
                System.out.println("Novembris");
                break;case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("no exit month");
        }

        //3.uzdevums
        int a=75;
        int b=80;
        int c=67;
        if (a>b && a>c){
            System.out.println(a);
        } else if (b>a && b>c){
            System.out.println(b);}
            else if (c>a && c>b){
                System.out.println(c);
        }
// 4.uzdevums
        String luksaforaKrasa ="zila";
            if (luksaforaKrasa.equals("zaļa")){
        System.out.println("Drīkst iet");}
            else if (luksaforaKrasa.equals("sarkana")) {
                System.out.println("Stāvi");      }
            else if (luksaforaKrasa.equals("dzeltena")){
                System.out.println(" Esi uzmanīgs!");}
            else {
                System.out.println(" Kļūda sistēmā");}
             //5.uzdevums
              printCard();
            printCard();
            printCard();

            //6.uzddevums
          printBusinessCardTwo("Līga","Liepiņa",22675467,1987);
          printBusinessCardTwo("Jānis","Kalniņš",23456533,1990 );
        }


           public static void printBusinessCardTwo(String vards,String uzvards,int telephone,int dateOfBirth){
               System.out.println(vards +" "+ uzvards);
               System.out.println(telephone);
               System.out.println(dateOfBirth);

           }
            public static void printCard(){
                System.out.println(" Vizītkarte");
                System.out.println("#########");
                System.out.println("Vārds:Inese");
                System.out.println(" Uzvārds: Zaķe");
                System.out.println("Telefona numurs: 29265768");
                System.out.println("Dzimšanas gads:1981");
                System.out.println("#########");
            }
    }

