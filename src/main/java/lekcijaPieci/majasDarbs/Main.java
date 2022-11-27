package lekcijaPieci.majasDarbs;

import lekcijaCetri.labDarbs.Rinkis;

public class Main {
    public static void main(String[] args) {


        Cilindrs cilindrsViens;
        cilindrsViens = new Cilindrs(18,5);


        cilindrsViens.setRadiuss(5.6);
        cilindrsViens.setAugstums(18.4);


        double aprekinatVirsmu = cilindrsViens.aprekinatVirsmu();
        double aprekinatTilpumu = cilindrsViens.aprekinatTilpumu();
        double aprekinatTilpumu1 = cilindrsViens.aprekinatTilpumu1();


        System.out.println("Cilindra virsma ir: " +aprekinatVirsmu);
        System.out.println("Cilindra tilpums ir: " +aprekinatTilpumu);
        System.out.println("Cilindra tilpums ir: " + aprekinatTilpumu1);


        System.out.println(cilindrsViens.aprekinatVirsmu());
        System.out.println(cilindrsViens.aprekinatTilpumu());
    }
}
