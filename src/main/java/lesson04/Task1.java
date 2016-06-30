package lesson04;

import java.util.Scanner;

/**
 * Created by lapte on 11.05.2016.
 */
public class Task1 {
    public static void main (String [] args) {
        /*
        Приложение, расчитывающее площадь поверхности или объём тороида.
        */
        double PI = 3.14;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите радиус тора: ");
        double R = in.nextDouble();

        System.out.print("Введите радиус образующей окружности: ");
        double r = in.nextDouble();

        System.out.print("Чтобы посчитать площадь поверхности, введите 1.\n"+
                "Чтобы посчитать объём, введите 2.\n");
        int ansver = in.nextInt();

        switch (ansver){
            case 1: System.out.print("Площадь поверхности тора равна "+4*PI*PI*R*r);
                break;
            case 2: System.out.print("Объём тора равен "+2*PI*PI*R*r*r);
                break;
            default: System.out.print("Введите число 1 или 2");
                break;
        }
    }
}
