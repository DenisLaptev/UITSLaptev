package lesson05;

/**
 * Created by lapte on 11.05.2016.
 */
public class Task2 {
    public static void main (String [] args) {

        //Приложение, реализующее циклический сдвиг двумерного массива на n элементов
        //влево, вправо, вверх, вниз.

        int [][] array = {
                {11,12,13,14,15,16,17,18,19,20},
                {21,22,23,24,25,26,27,28,29,30},
                {31,32,33,34,35,36,37,38,39,40},
                {41,42,43,44,45,46,47,48,49,50},
                {51,52,53,54,55,56,57,58,59,60}
        };


        int [][] arrayToLeft = new int[5][10];
        int [][] arrayToRight = new int[5][10];
        int [][] arrayToUp = new int[5][10];
        int [][] arrayToDown = new int[5][10];

        int n;// переменная показывает на сколько позиций будем сдвигать
        n=4;

        //вывод двумерного массива в виде таблицы (матрицы)
        System.out.println("Исходный массив:");
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        for (int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){

                arrayToLeft[i][j]=array[i][(j+n)%array[i].length];
                arrayToRight[i][j]=array[i][(j-n+array[i].length)%array[i].length];
                arrayToUp[i][j]=array[(i+n)%array.length][j];
                arrayToDown[i][j]=array[(i-n+array.length)%array.length][j];

            }
        }

        System.out.println("Массив, сдвинутый на "+n+" позиций влево:");
        for (int i=0;i<arrayToLeft.length;i++){
            for(int j=0;j<arrayToLeft[i].length;j++){
                System.out.print(arrayToLeft[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Массив, сдвинутый на "+n+" позиций вправо:");
        for (int i=0;i<arrayToRight.length;i++){
            for(int j=0;j<arrayToRight[i].length;j++){
                System.out.print(arrayToRight[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Массив, сдвинутый на "+n+" позиций вверх:");
        for (int i=0;i<arrayToUp.length;i++){
            for(int j=0;j<arrayToUp[i].length;j++){
                System.out.print(arrayToUp[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Массив, сдвинутый на "+n+" позиций вниз:");
        for (int i=0;i<arrayToDown.length;i++){
            for(int j=0;j<arrayToDown[i].length;j++){
                System.out.print(arrayToDown[i][j]+" ");
            }
            System.out.println();
        }
    }
}
