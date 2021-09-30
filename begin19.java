package Begin;

import java.util.Scanner;

public class begin19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("X1 = ");
        double x1 = sc.nextDouble();

        System.out.println("Y1 = ");
        double y1 = sc.nextDouble();

        System.out.println("X2 = ");
        double x2 = sc.nextDouble();

        System.out.println("Y2 = ");
        double y2 = sc.nextDouble();

        double a = y2 - y1;
        double b = x2 - x1;

        double p = 2 * (a + b);
        double s = a * b;

        System.out.println("P = " + p);
        System.out.println("S = " + s);
    }
}
