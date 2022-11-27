package lekcijaCetri.labDarbs;

public class House {
    int stavuDaudzums;
    int loguSkaits;

    public House(int stavuDaudzums, int loguSkaits, int durvjuSkaits, String adrese, double griestuAugstums, long kadastralaVertiba, boolean vaiPrivatipasums) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvjuSkaits = durvjuSkaits;
        this.adrese = adrese;
        this.griestuAugstums = griestuAugstums;
        this.kadastralaVertiba = kadastralaVertiba;
        this.vaiPrivatipasums = vaiPrivatipasums;
    }

    int durvjuSkaits;
    String adrese;
    double griestuAugstums;
    long kadastralaVertiba;
    boolean vaiPrivatipasums;
}



