package lesson03;

/**
 * Created by lapte on 11.05.2016.
 */
public class Task2 {
    public static void main (String [] args) {
        double PI=3.14;
        double r=3;
        double rMax=10;
        double rMin=9;

        double lCircle=2.0*PI*r;
        double sCircle=PI*r*r;
        double sRing=PI*(rMax*rMax-rMin*rMin);

        System.out.println(lCircle);
        System.out.println(sCircle);
        System.out.println(sRing);

    }
}
