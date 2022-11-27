package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {
        House majaViens= new House(6,10,5,"Bruninieku iela 67",2,2,true);
        majaViens.adrese="Bruņinieku iela 47";
        majaViens.stavuDaudzums = 6;
        majaViens.durvjuSkaits= 10;
        majaViens.griestuAugstums= 3.2;
        majaViens.kadastralaVertiba= 25000;
        majaViens.loguSkaits= 35;
        majaViens.vaiPrivatipasums= true;

        House majaDivi =new House(8,6,2,"Mālpils iela 2",6,10000,false);
        majaDivi .adrese= "Mālpils iela 2";
        majaDivi.stavuDaudzums = 5;
        majaDivi.durvjuSkaits= 20;
        majaDivi.griestuAugstums= 2.2;
        majaDivi.kadastralaVertiba= 15000;
        majaDivi.loguSkaits= 29;
        majaDivi.vaiPrivatipasums= false;

        char []mansVards ={'i','n','e','3'};
        int i= 0;
        for (char burts:mansVards){
            System.out.println("cikls nr.:"+i);
            System.out.println(burts);
            i++;}

        House[] majas ={majaViens, majaDivi};
        for (House maja: majas){
            System.out.println(maja.adrese);
            System.out.println(maja.durvjuSkaits);
            System.out.println(maja.griestuAugstums);
            System.out.println(maja.kadastralaVertiba);
            System.out.println( maja.stavuDaudzums);
            System.out.println(maja.vaiPrivatipasums);
        }

        Velosipeds mansVelo= new Velosipeds();
        System.out.println(mansVelo.atrumi);
        mansVelo.printAtrums();

        Velosipeds ritenBraucejsViens=new Velosipeds();
        Velosipeds ritenBraucejsDivi= new Velosipeds();
        Velosipeds ritenisX=new Velosipeds("ZKK",21,10);

        ritenBraucejsViens.atrumi= 40;
        ritenBraucejsDivi.atrumi =30;

        ritenBraucejsViens.printAtrums();
        ritenBraucejsDivi.printAtrums();

        Velosipeds ritenBraucejsTris= new Velosipeds();
        System.out.println(" izgatavosans datums"+ ritenBraucejsTris.izgatavosanasDatums);

        ritenBraucejsTris.zimols= "ZKK";
        ritenBraucejsTris.printAtrums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();

        ritenBraucejsTris.printAtrums();
        System.out.println("Priekšā izskrien kaķis");

        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.printAtrums();
        ritenBraucejsTris.printAtrums();

        Zivs zivsViens= new Zivs();
        zivsViens.vaiZivsIrDziva =true;
        zivsViens.suga= "Līdaka";
        zivsViens.garums=25;
        zivsViens.svars= 2000;

        System.out.println(zivsViens.suga);
        System.out.println(zivsViens.garums);
        System.out.println(zivsViens.svars);
        System.out.println(zivsViens.vaiZivsIrDziva);

        Rinkis rinkisViens =new Rinkis(5);
        rinkisViens.radiuss=5;
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.aprekinatRinkaLiniju());

        Rinkis rinkisDivi=new Rinkis(10);
        rinkisDivi.radiuss=11;
        System.out.println(rinkisDivi.rekinatLaukumu());
        System.out.println(rinkisDivi.aprekinatRinkaLiniju());



    }
}
