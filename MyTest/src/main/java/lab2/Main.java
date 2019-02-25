package lab2;

/**
 * C5 = 1 транспонування
 * C7 = 4 тип елементів матриці long
 * C11 = 7 Обчислити суму найбільших елементів в стовпцях матриці
 * з непарними номерами та найменших елементів в стовпцях
 * матриці з парними номерами
 */
public class Main {
    public static void main(String[] args) {
        /*final int numberMatrixRows = 2;
        final int numberMatrixColumns = 2;
        final long[][] B = new long[numberMatrixRows][numberMatrixColumns];
        B[0][0] = 1;
        B[0][1] = 2;
        B[1][0] = 3;
        B[1][1] = 4;*/
        final long[][] B = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        long buf;
        for (int i = 0; i < B.length - 1; i++) {
            for (int j = i + 1; j < B[i].length; j++) {
                buf = B[i][j];
                B[i][j] = B[j][i];
                B[j][i] = buf;
                /*B[i][j] = B[i][j] + B[j][i];
                B[j][i] = B[i][j] - B[j][i];
                B[i][j] = B[i][j] - B[j][i];*/
            }
        }
        System.out.println("++++++++++++++");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

//        long max = Long.MAX_VALUE;
        long max;
        long S = 0;
        for (int j = 1; j < B[0].length; j += 2) {
            max = B[0][j];
            for (int i = 1; i < B.length; i++) {
                if (max < B[i][j]) {
                    max = B[i][j];
                }
            }
            S += max;
        }
        long min;
        for (int j = 0; j < B[0].length; j += 2) {
            min = B[0][j];
            for (int i = 1; i < B.length; i++) {
                if (min > B[i][j]) {
                    min = B[i][j];
                }
            }
            S += min;
        }

        System.out.println(S);
    }
}
