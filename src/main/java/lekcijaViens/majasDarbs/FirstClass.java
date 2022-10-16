package lekcijaViens.majasDarbs;

public class FirstClass {
    public static void main(String[] args) {
        String valsts="Taizeme";
        String galvasPilseta="Bangkoka";
        int iedzivotajuSkaits = 67010000;
        int platiba=513115;
        String oficialaValoda ="Taju valoda";
        boolean irESDalibvalsts= false;
        char valuta='฿';
        System.out.println(valsts+iedzivotajuSkaits +galvasPilseta+platiba+oficialaValoda+"ir ES Dalibvalsts:"+irESDalibvalsts+valuta);

      long taizemesIkpDolaros= 1475000000000L;
      byte dziniKoeficentsTaizeme= 42;
      short ikpUzVienuIedzivotajuDolaros= 21057;
      float udensProcentosNoPlatibas=1.4F;
      double lielakaOzolaLatvijaApkartmers= 10.3;
      boolean zivijSarkanasZaunasSvaiga = true;
      boolean zivijDulkainasAcisVeca = true;
        System.out.println("Taizemes IKP:"+ taizemesIkpDolaros+ "\nIKP uz vienu iedzīvotāju:"+ikpUzVienuIedzivotajuDolaros+"\n Ūdens platība procentos:"+udensProcentosNoPlatibas+"\nLielākā ozola apkartmērs:"+lielakaOzolaLatvijaApkartmers);


       int x=10;
       int y=2;
       int rezultats=x+y;
       int rezultats1=x-y;
       int rezultats2=x/y;
       int rezultats3=x*y;
        System.out.println(rezultats +rezultats1+rezultats2+rezultats3);

        rezultats= x-y;
        System.out.println( rezultats);
        rezultats=15%3;
        System.out.println(rezultats);
        rezultats=(x+x*y)+y;
        System.out.println(rezultats);
        rezultats=y-x;
        System.out.println(rezultats);
        rezultats=(x*y)/4;
        System.out.println(rezultats);
        rezultats=(x/y)*x;
        System.out.println(rezultats);

    }
}
