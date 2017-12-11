package univer.epam.java.task1.controller;

import java.util.Arrays;

public class Sort {
    public static void sortOne(int[] arr) {
        int buff;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] >= 0 && arr[j + 1] > arr[j] || arr[j] >= 0 && arr[j + 1] < 0) {
                    buff = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = buff;
                } else if (arr[j] < 0 && arr[j + 1] < arr[j]) {
                    buff = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = buff;
                }
            }
        }
    }

    public static void sortTwo(int[] arr) {
        int buff;
        for (int i = 0, j = arr.length - 1; i + 1 != j && i != j; ) {
            if (arr[i] < 0 && arr[j] >= 0) {
                buff = arr[i];
                arr[i] = arr[j];
                arr[j] = buff;
                i++;
                j--;
            } else if (arr[i] < 0 && arr[j] < 0)
                j--;

            else if (arr[i] >= 0 && arr[j] >= 0)
                i++;

            else {
                i++;
                j--;
            }
        }
    }

    public static void sortColumn(int[][] matrix) {
        double[] mediana = new double[matrix[1].length];
        int buffMatrix;
        double buffMediana;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                mediana[j] += matrix[i][j];
            }
        }

        for (int i = 0; i < mediana.length; i++) {
            mediana[i] /= (double) matrix.length;
        }

        System.out.println("Columns averages");
        System.out.println(Arrays.toString(mediana));


        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (mediana[j] < mediana[j + 1]) {
                    buffMatrix = matrix[i][j];
                    matrix[i][j] = matrix[i][j + 1];
                    matrix[i][j + 1] = buffMatrix;
                    buffMediana = mediana[j];
                    mediana[j] = mediana[j + 1];
                    mediana[j + 1] = buffMediana;
                }
            }
        }
    }

    public static void sortRowSeries(int[][] matrix) {
        int[][] seriesCount = new int[matrix.length][matrix[1].length];
        int[] maxSeriesRow = new int[matrix.length];
        int matrixBuffer;
        int seriesBuffer;

        for (int i = 0; i < seriesCount.length; i++) {
            for (int j = 0; j < seriesCount[i].length; j++) {
                seriesCount[i][j] = 0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println();

        for (int i = 0; i < seriesCount.length; i++) {
            for (int j = 1; j < seriesCount[i].length; j++) {
                if (matrix[i][j - 1] == matrix[i][j]) {
                    seriesCount[i][j] = seriesCount[i][j - 1]++;
                }
            }
        }
        System.out.println(Arrays.deepToString(seriesCount));
        System.out.println();

        for (int i = 0; i < seriesCount.length; i++) {
            maxSeriesRow[i] = seriesCount[i][0];
            for (int j = 1; j < seriesCount[i].length; j++) {
                if (maxSeriesRow[i] < seriesCount[i][j]) {
                    maxSeriesRow[i] = seriesCount[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(maxSeriesRow));
        System.out.println();

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxSeriesRow[i] < maxSeriesRow[i + 1]) {
                    seriesBuffer = maxSeriesRow[i];
                    maxSeriesRow[i] = maxSeriesRow[i + 1];
                    maxSeriesRow[i + 1] = seriesBuffer;
                    matrixBuffer = matrix[i][j];
                    matrix[i][j] = matrix[i + 1][j];
                    matrix[i + 1][j] = matrixBuffer;
                }
            }

        }


        System.out.println(Arrays.deepToString(matrix));
    }
}