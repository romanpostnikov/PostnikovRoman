package univer.epam.java.task1.service;

public class ArrayGenerator {
    public static int[] generate(int n) {
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100 - 50);
        }
        return mas;
    }

    public static int[][] generate(int n, int m) {
        int[][] mas = new int[n][m];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
        return mas;

    }
}
