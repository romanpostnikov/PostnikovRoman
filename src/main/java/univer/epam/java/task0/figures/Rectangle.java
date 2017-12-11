package univer.epam.java.task0.figures;

public class Rectangle {
    public static void rectangleDraw(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
