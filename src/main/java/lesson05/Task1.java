package lesson05;

import java.util.Arrays;

/**
 * Created by lapte on 11.05.2016.
 */
public class Task1 {
    public static void main (String [] args) {

        //Приложение, реализующее циклический сдвиг одномерного массива влево и вправо на n элементов.

        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12};

        int [] arrayToLeft = new int[array.length];
        int [] arrayToRight = new int[array.length];

        int n;// переменная показывает на сколько позиций будем сдвигать
        n=4;

        System.out.println("Исходный массив: \n"+ Arrays.toString(array));

        for (int i=0;i<array.length;i++){
            arrayToLeft[i]=array[(i+n)%array.length];
            arrayToRight[i]=array[(i-n+array.length)%array.length];
        }

        System.out.println("Массив, сдвинутый на "+n+" позиций влево: \n"+Arrays.toString(arrayToLeft));
        System.out.println("Массив, сдвинутый на "+n+" позиций вправо: \n"+Arrays.toString(arrayToRight));
    }
}
