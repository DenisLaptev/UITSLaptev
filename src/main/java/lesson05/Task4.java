package lesson05;

/**
 * Created by lapte on 11.05.2016.
 */
public class Task4 {
    public static void main (String [] args) {

        //Приложение создаёт матрицу треугольного вида.
        //Реализуется вывод матрицы в консоль.
        //Реализуется вывод матрицы в зеркальном виде по горизонтали и по вертикали.

        int [][] matrix = new int[4][4];
        int [][] mirrorHorizontal = new int[4][4];
        int [][] mirrorVertical = new int[4][4];

        int [][] tempH = new int[4][4];//вспомагательные матрицы
        int [][] tempV = new int[4][4];



        // Вывод на экран треугольников чисел.
        int k1=0;
        outer:  for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(j>i){
                    System.out.println();
                    continue outer;
                }
                System.out.print(" "+k1);
                k1++;
            }
        }
        System.out.println();


        int k2=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(j<i){
                    System.out.print(" "+" ");
                    continue ;
                }
                System.out.print(" "+k2);
                k2++;
            }
            System.out.println();
        }
        System.out.println();



        int k3=0;
        outer3: for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(j>=(3-i)){
                    System.out.print(" "+k3);
                    k3++;
                    System.out.println();
                    continue outer3;
                }
                System.out.print(" "+k3);
                k3++;
            }
        }
        System.out.println();


        int k4=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(j<(3-i)){
                    System.out.print(" "+" ");
                    continue;
                }
                System.out.print(" "+k4);
                k4++;
            }
            System.out.println();
        }
        System.out.println();


        // Создание треугольной матрицы.
        int k=0;
        outer:  for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(j>i){
                    continue outer;
                }
                matrix[i][j]=k;
                k++;
            }
        }

        System.out.println("Исходная матрица:");
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        //мы скопировали исходную матрицу matrix в матрицы mirrorHorizontal и mirrorVertical,
        //а потом в них поменяли местами элементы в строках или столбцах соответственно

        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                mirrorHorizontal[i][j]=matrix[i][j];
                mirrorVertical[i][j]=matrix[i][j];
            }
        }

        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length/2;j++){
                tempH[i][j]=mirrorHorizontal[i][j];
                mirrorHorizontal[i][j]=mirrorHorizontal[i][matrix[i].length-j-1];
                mirrorHorizontal[i][matrix[i].length-j-1]=tempH[i][j];
            }
        }

        for (int i=0;i<matrix.length/2;i++){
            for(int j=0;j<matrix[i].length;j++){
                tempV[i][j]=mirrorVertical[i][j];
                mirrorVertical[i][j]=mirrorVertical[matrix.length-i-1][j];
                mirrorVertical[matrix.length-i-1][j]=tempH[i][j];
            }
        }

        System.out.println("Зеркальная матрица по горизонтали:");
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(mirrorHorizontal[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Зеркальная матрица по вертикали:");
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(mirrorVertical[i][j]+" ");
            }
            System.out.println();
        }


    }
}
