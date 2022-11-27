package lekcijaPieci.majasDarbs;

import java.util.Date;

public class Cilindrs {
    private double  augstums;
    private double radiuss;

   public double PI= 3.14;



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
        double tilpums = (PI* radiuss*radiuss)*augstums;
        return tilpums;
    }

    public double aprekinatTilpumu1() {
        return (PI * radiuss*radiuss )* augstums;
    }
    public double aprekinatVirsmu() {
            return PI*radiuss*radiuss;
        }



    }

