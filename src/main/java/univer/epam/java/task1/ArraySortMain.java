package univer.epam.java.task1;

import java.util.Arrays;

import static univer.epam.java.task1.service.ArrayGenerator.*;
import static univer.epam.java.task1.controller.Sort.*;


class ArraySortMain {

    public static void main(String[] args) {

        int[] arrayOne = generate(20);
        System.out.println("Input array for sorting");
        System.out.println(Arrays.toString(arrayOne));
        sortOne(arrayOne);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arrayOne));

        int[] arrayTwo = generate(20);
        System.out.println("Input array for division");
        System.out.println(Arrays.toString(arrayTwo));
        sortTwo(arrayTwo);
        System.out.println("Divided array");
        System.out.println(Arrays.toString(arrayTwo));

        int[][] matrixOne = generate(3, 4);
        System.out.println("Input matrix for sorting columns");
        System.out.println(Arrays.deepToString(matrixOne));
        sortColumn(matrixOne);
        System.out.println("Matrix with sorted columns");
        System.out.println(Arrays.deepToString(matrixOne));

        int[][] matrixTwo = generate(3,4);
        System.out.println("Input matrix for sorting rows");
        System.out.println(Arrays.deepToString(matrixTwo));
        sortRowSeries(matrixTwo);
        System.out.println("Matrix with sorted rows");
        System.out.println(Arrays.deepToString(matrixTwo));
    }
}
