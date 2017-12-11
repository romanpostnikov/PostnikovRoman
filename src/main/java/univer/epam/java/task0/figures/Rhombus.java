package univer.epam.java.task0.figures;

public class Rhombus {
    public static void rhombusDraw(int diag) {
        if ((float) diag % 2 == 0) {
            diag -= 1;
        }
        int x = diag / 2;
        for (int i = 1; i <= diag; i++) {
            for (int j = 1; j <= diag; j++) {
                if (j + i == x + 2 || j + i - x == diag + 1 || j - x == i || i - x == j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
