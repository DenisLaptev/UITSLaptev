package lesson04;

import java.util.Scanner;

/**
 * Created by lapte on 11.05.2016.
 */
public class Task2 {
    public static void main (String [] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Введите число в интервале [0,99]");
        int Number = in.nextInt();

        int division;
        String strD=null;

        int modDivision;
        String strMD=null;

        division=Number/10;
        modDivision=Number%10;

        if (Number<0||Number>99){
            System.out.println("Ваше число не входит в интервал [0,99]");
        }
        else{
            if (Number>=10 && Number<20){
                switch (Number) {

                    case 10: System.out.println("десять");
                        break;
                    case 11: System.out.println("одиннадцать");
                        break;
                    case 12: System.out.println("двенадцать");
                        break;
                    case 13: System.out.println("тринадцать");
                        break;
                    case 14: System.out.println("четырнадцать");
                        break;
                    case 15: System.out.println("пятнадцать");
                        break;
                    case 16: System.out.println("шестнадцать");
                        break;
                    case 17: System.out.println("семнадцать");
                        break;
                    case 18: System.out.println("восемнадцать");
                        break;
                    case 19: System.out.println("девятнадцать");
                        break;
                }
            }
            else{
                switch (division) {
                    case 0: strD=null;
                        break;
                    case 1: strD=null;
                        break;
                    case 2: strD="двадцать";
                        break;
                    case 3: strD="тридцать";
                        break;
                    case 4: strD="сорок";
                        break;
                    case 5: strD="пятьдесят";
                        break;
                    case 6: strD="шестьдесят";
                        break;
                    case 7: strD="семдесят";
                        break;
                    case 8: strD="восемдесят";
                        break;
                    case 9: strD="девяносто";
                        break;
                }

                switch (modDivision) {
                    case 0: strMD=null;
                        break;
                    case 1: strMD="один";
                        break;
                    case 2: strMD="два";
                        break;
                    case 3: strMD="три";
                        break;
                    case 4: strMD="четыре";
                        break;
                    case 5: strMD="пять";
                        break;
                    case 6: strMD="шесть";
                        break;
                    case 7: strMD="семь";
                        break;
                    case 8: strMD="восемь";
                        break;
                    case 9: strMD="девять";
                        break;
                }
                if (Number>=0 && Number<10){

                    if (Number==0){
                        System.out.println("ноль");
                    }

                    if (Number>0 && Number<10){
                        System.out.println(strMD);
                    }
                }
                else{
                    if (modDivision==0){
                        System.out.println(strD);
                    }
                    else {
                        System.out.println(strD+" "+strMD);
                    }
                }

            }

        }

    }
}
