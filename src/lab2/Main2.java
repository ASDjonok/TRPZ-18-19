package lab2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3, 11},
                     {4, 5, 6, 12},
                     {7, 8, 9, 13}};
        int B[][] = {{8, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        final int bRowNumber = B.length;
        final int bColumnNumber = B[0].length;
        final int aRowNumber = A.length;
        final int aColumnNumber = A[0].length;
        int[][] C = new int[aRowNumber + bRowNumber][aColumnNumber + bColumnNumber];
        for (int i = 0; i < (bRowNumber + aRowNumber); i++) {
            for (int j = 0; j < (bColumnNumber + aColumnNumber); j++) {
                if (j < aColumnNumber&&i<aRowNumber) {
                    C[i][j] = A[i][j];
                }
                else if (j >= aColumnNumber&&i >= aRowNumber){
                    C[i][j] = B[(i-aRowNumber)][j- aColumnNumber];
                }
                else {
                    C[i][j] = 0;
                }
                }
        }
        for (int i1 = 0; i1 < C.length; i1++) {
            for (int j1 = 0; j1<C[0].length; j1++) {
                System.out.print(C[i1][j1]+" ");
            }
            System.out.println();
        }

        }
    }
