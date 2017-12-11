package univer.epam.java.task0.figures;

public class Triangle {
    public static void triangleDraw(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == length)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}