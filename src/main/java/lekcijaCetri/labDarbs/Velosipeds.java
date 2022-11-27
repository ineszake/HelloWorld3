package lekcijaCetri.labDarbs;

import java.util.Date;

public class Velosipeds {
    String zimols;
    int ramjaIzmers;
    int atrumi=0;

    Date izgatavosanasDatums;
    Velosipeds(){
        System.out.println( "Taisam jauno velo");
        izgatavosanasDatums= new Date();
        System.out.println("Izgatavošanas datums:" + izgatavosanasDatums);
    }
    // Konstruktors: Sis teksts izprintējās, kur ir vārds Velosipeds. Var arī palikt tukšs.
    // Date: m;es esam pateikusi, ka velosipeds taja laikā,

    Velosipeds (String zimols, int ramjaIzmers, int atrumi) {
        izgatavosanasDatums=new Date();
        this.zimols=zimols;
        this.atrumi=atrumi;
        this.ramjaIzmers=ramjaIzmers;

    }
    public void printAtrums(){
        System.out.println(atrumi);
    }
 public void  paatrinajums (){
     System.out.println(zimols+" Velo paatrinas");
     atrumi= atrumi+ 5;
 }
 public void bremzesana(){
     System.out.println(zimols+" Velo bremzē"+ " Atrums " + atrumi);
     if ( atrumi>=5){
     atrumi= atrumi-5;
 } else {
         System.out.println(" Beidz  bremzet, tu jau stāvi");
     }
     }
}
