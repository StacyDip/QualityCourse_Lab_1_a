/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.golenok.lab_1_a;

/**
 *
 * @author Stacy
 */
public class MatrixChanged {

    public void validateMatrix(int matrix[][]) {
        if (matrix == null) {
            throw new NullPointerException();
        }

        if (matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Argument is not validate");
        }
    }

    public void validateNumberCol(int threshold) {
        if (threshold <= 0) {
            throw new IllegalArgumentException("Value  not validate");
        }
    }

    public int[] sumCol(int[][] mas) {

        validateMatrix(mas);

        int[] sumOnCol = new int[mas[0].length];

        for (int i = 0; i < sumOnCol.length; i++) {
            for (int j = 0; j < mas.length; j++) {

                sumOnCol[i] = sumOnCol[i] + mas[j][i];

            }
        }
        return sumOnCol;
    }

    public int serchNumberColWithMinSum(int[][] mas) {
        validateMatrix(mas);
        int[] sumOnCol = sumCol(mas);
        int numberColWithMminSum = 0;
        int minSum = sumOnCol[0];
        for (int i = 0; i < sumOnCol.length; i++) {
            if (minSum > sumOnCol[i]) {
                minSum = sumOnCol[i];
                numberColWithMminSum = i + 1;

            }

        }

        return numberColWithMminSum;
    }

    public void sortCol(int[][] mas, int threshold) {
        int temp;
        validateMatrix(mas);
        validateNumberCol(threshold);

        for (int i = 0; i < threshold - 1; i++) {

            for (int j = 0; j < mas.length; j++) {
                for (int k = j + 1; k < mas.length; k++) {
                    if (mas[j][i] < mas[k][i]) {
                        temp = mas[j][i];
                        mas[j][i] = mas[k][i];
                        mas[k][i] = temp;
                    }
                }
            }
        }
    }
}
