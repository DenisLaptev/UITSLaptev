package lesson03;

/**
 * Created by lapte on 11.05.2016.
 */
public class Task3 {
    /*
    Программа рассчитывает:
    1)объём цилиндра
    2)объём полого цилиндра
    3)площадь боковой поверхности цилиндра (не полого)
*/
    public static void main (String [] args) {

        double H=5.5;

        double lCircle=18.84;
        double sCircle=28.25;
        double sRing=59.66;

        double vCylinder=sCircle*H;
        double vPolCylinder=sRing*H;
        double sBokCylinder=lCircle*H;

        System.out.println("Объём цилиндра равен " + vCylinder);
        System.out.println("Объём полого цилиндра равен " + vPolCylinder);
        System.out.println("Площадь боковой поверхности цилиндра (не полого) равна " + sBokCylinder);
    }

}
