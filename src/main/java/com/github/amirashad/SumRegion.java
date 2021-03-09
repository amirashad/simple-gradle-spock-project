package com.github.amirashad;

public class SumRegion {
    int[][] matrix;

    public SumRegion(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        this.matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            int sumRow = 0;
            for (int j = 0; j < n; j++) {
                sumRow += matrix[i][j];
                int up = i >= 1 ? this.matrix[i - 1][j] : 0;
                this.matrix[i][j] = up + sumRow;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return matrix[row2][col2] +
                (row1 >= 1 && col1 >= 1 ? matrix[row1 - 1][col1 - 1] : 0) -
                (row1 >= 1 ? matrix[row1 - 1][col2] : 0) -
                (col1 >= 1 ? matrix[row2][col1 - 1] : 0);
    }
}
