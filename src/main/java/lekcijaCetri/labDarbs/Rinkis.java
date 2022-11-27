package lekcijaCetri.labDarbs;

public class Rinkis {
    public double aprekinatLaukumu;
    double radiuss;

    public Rinkis(double radiuss) {
        this.radiuss = radiuss;
    }

    double PI= 3.14;
    double PI2= Math.PI;

    public double rekinatLaukumu(){
        return radiuss*radiuss*PI;
    }

    public double aprekinatRinkaLiniju(){
        return 2*PI*radiuss;
    }


    }

