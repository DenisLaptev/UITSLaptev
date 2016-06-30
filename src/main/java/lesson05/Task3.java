package lesson05;

/**
 * Created by lapte on 11.05.2016.
 */
public class Task3 {
    public static void main (String [] args) {

        //Приложение, реализующее транспонирование матрицы.

        int [][] matrix = {
                {11,12,13,14,15,16,17,18,19,20},
                {21,22,23,24,25,26,27,28,29,30},
                {31,32,33,34,35,36,37,38,39,40},
                {41,42,43,44,45,46,47,48,49,50},
                {51,52,53,54,55,56,57,58,59,60}
        };


        int [][] matrixTransp = new int[10][5];


        //вывод двумерного массива в виде таблицы (матрицы)
        System.out.println("Исходная матрица:");
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){

                matrixTransp[j][i]=matrix[i][j];

            }
        }

        System.out.println("Транспонированная матрица:");
        for (int i=0;i<matrixTransp.length;i++){
            for(int j=0;j<matrixTransp[i].length;j++){
                System.out.print(matrixTransp[i][j]+" ");
            }
            System.out.println();
        }

    }
}
