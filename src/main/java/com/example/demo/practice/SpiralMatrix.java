package com.example.demo.practice;

import com.fasterxml.jackson.core.JsonToken;

public class SpiralMatrix {

    static int counter = 1;
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(1);
        print(matrix);
    }

    public static int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];

        for (int i = 0; i < ((n % 2==0)? n/2: n/2+1); i++) {
            fillMatrix(matrix, i);
        }
        return matrix;

    }

    public static void fillMatrix(int[][] matrix, int index) {
        for (int i = index; i < matrix.length - index; i++) {
            matrix[index][i] = counter ++;
        }

        for (int j = 1 + index; j < matrix.length - index; j++) {
            matrix[j][matrix.length - 1 - index] = counter ++;
        }

        for (int i = matrix.length - 2 - index; i >= 0 + index; i--) {
            matrix[matrix.length - 1 - index][i] = counter ++;
        }

        for (int j = matrix.length - 2 - index; j > 0 + index; j--) {
            matrix[j][index] = counter ++;
        }
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

}
