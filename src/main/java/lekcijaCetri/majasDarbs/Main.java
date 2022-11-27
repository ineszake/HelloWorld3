package lekcijaCetri.majasDarbs;

import lekcijaCetri.labDarbs.Rinkis;

public class Main {
    public static void main(String[] args) {
        Tristuris tristurisViens =new Tristuris(5,5,4,false,
                true);
        tristurisViens.malaViens=5;
        tristurisViens.malaDivi=5;
        tristurisViens.malaTris=4;
        tristurisViens.vaiTristurisIrVienadMalu= false;
        tristurisViens.vaiTristurisIrVienadSanu= true;

        System.out.println("Trīstūra laukums ir" + tristurisViens.aprekinatLaukumu() );
        System.out.println(tristurisViens.vaiTristurisIrVienadMalu);
        System.out.println(tristurisViens.vaiTristurisIrVienadSanu);


        Tristuris tristurisDivi =new Tristuris(5,5,5,true,
                false);
        tristurisDivi.malaViens=5;
        tristurisDivi.malaDivi=5;
        tristurisDivi.malaTris=5;
        tristurisDivi.vaiTristurisIrVienadMalu= true;
        tristurisDivi.vaiTristurisIrVienadSanu= false;

        System.out.println("Trīstūra laukums ir" + tristurisDivi.aprekinatLaukumu());
        System.out.println(tristurisDivi.vaiTristurisIrVienadMalu);
        System.out.println(tristurisDivi.vaiTristurisIrVienadSanu);

       Tristuris tristurisTris= new Tristuris( 22,13,4,false,
               false);

        System.out.println("Trīstūra laukums ir" + tristurisTris.aprekinatLaukumu());
        System.out.println(tristurisTris.vaiTristurisIrVienadMalu);
        System.out.println(tristurisTris.vaiTristurisIrVienadSanu);

    }
}
