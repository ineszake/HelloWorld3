package lekcijaPieci.majasDarbs;

import java.util.Date;

public class Cilindrs {
    private double  augstums;
    private double radiuss;

    double PI= 3.14;
    double radiuss2= radiuss*radiuss;


    public double getRadiuss() {
        return radiuss;
    }
    public double getAugstums() {
        return augstums;
    }
    public void setRadiuss(double radiuss) {
        this.radiuss = radiuss;
    }
    Cilindrs ( double augstums, double radiuss) {
        this.radiuss=radiuss;
        this.augstums =augstums;
    }


    public void setAugstums(double augstums) {

        this.augstums = augstums;
    }
    public double aprekinatTilpumu() {
        double tilpums = PI* radiuss2*augstums;
        return tilpums;
    }

    public double aprekinatTilpumu1() {
        return PI * radiuss2 * augstums;
    }
    public double aprekinatVirsmu() {
            return PI*radiuss*radiuss;
        }



    }

