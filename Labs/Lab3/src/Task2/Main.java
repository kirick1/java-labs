package Task2;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {

        System.out.println("Matrix1:");

        Matrix matrix1 = new Matrix(new int[][] {
                {33,34,12},
                {33,19,10},
                {12,14,17},
                {84,24,51},
                {43,71,21}
        });

        System.out.println(matrix1);
        System.out.println("Matrix2:");

        Matrix matrix2 = new Matrix(new int[][] {
                {10,11,34,55},
                {33,45,17,81},
                {45,63,12,16}
        });
        System.out.println(matrix2);
        System.out.println("Matrix3:");
        Matrix matrix3 = new Matrix(new int[][] {
                {1, 3, 4, 5},
                {8, 1, 9, 10},
                {2, 1, 4, 19},
                {2, 3, 1, 2}
        });
        System.out.println(matrix3);
        System.out.println("Matrices:");
        Matrix[] matrices1 = new Matrix[] { matrix1, matrix2, matrix3 };
        System.out.println(Arrays.toString(matrices1));
        System.out.println("Replaced max and min:");
        for (Matrix matrix : matrices1) matrix.replaceMaxAndMinInColumn(1);
        System.out.println(Arrays.toString(matrices1));
        Matrix[] matrices2 = new Matrix[] { matrix1, matrix2, matrix3 };
        System.out.println("Square:");
        for (Matrix matrix : matrices2) if (matrix.isValidToMultiply()) matrix.square();
        System.out.println(Arrays.toString(matrices2));
    }
}
