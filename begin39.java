package Begin;

import java.util.Scanner;

public class begin39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A nolga teng bulmasin. A = ");
        double a = sc.nextDouble();

        System.out.print("B = ");
        double b = sc.nextDouble();

        System.out.print("C = ");
        double c = sc.nextDouble();

        if (a != 0) {
            double d = (Math.pow(b, 2) - 4) * a * c;
            double x = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("D = " + d);
            System.out.println("X1.2 = " + x);
        }
    }
}
