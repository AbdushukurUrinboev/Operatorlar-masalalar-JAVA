package Begin;

import java.util.Scanner;

public class begin40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A1 = ");
        double a1 = sc.nextDouble();

        System.out.print("B1 = ");
        double b1 = sc.nextDouble();

        System.out.print("C1 = ");
        double c1 = sc.nextDouble();

        System.out.print("A2 = ");
        double a2 = sc.nextDouble();

        System.out.print("B2 = ");
        double b2 = sc.nextDouble();

        System.out.print("C2 = ");
        double c2 = sc.nextDouble();

        double d = (a1 * b2 - a2 * b1);
        double x = (c1 * b2 - c2 * b1) / d;
        double y = (a1 * c2 - a2 * c1) / d;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("D = " + d);

    }
}
