package lekcijaCetri.majasDarbs;

public class Tristuris {
    public double aprekinatLaukumu;

    int malaViens;
    int malaDivi;
    int malaTris;

    boolean vaiTristurisIrVienadMalu;
    boolean vaiTristurisIrVienadSanu;


    public Tristuris(int malaViens, int malaDivi, int malaTris, boolean vaiTristurisIrVienadMalu, boolean vaiTristurisIrVienadSanu) {
        this.malaViens = malaViens;
        this.malaDivi = malaDivi;
        this.malaTris = malaTris;
        this.vaiTristurisIrVienadMalu=vaiTristurisIrVienadMalu;
        this.vaiTristurisIrVienadSanu=vaiTristurisIrVienadSanu;
    }


    public double getPerimeter()
    {
        return(malaViens+malaDivi+malaTris) ;

    }

    public double aprekinatLaukumu() {
       double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - malaViens) * (p - malaDivi) * (p - malaTris)));
    }
}
