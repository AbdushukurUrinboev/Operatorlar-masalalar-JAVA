package Begin;

import java.util.Scanner;

public class begin21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("X1 = ");
        double x1 = sc.nextDouble();

        System.out.print("X2 = ");
        double x2 = sc.nextDouble();

        System.out.print("Y1 = ");
        double y1 = sc.nextDouble();

        System.out.print("Y2 = ");
        double y2 = sc.nextDouble();

        System.out.print("X3 = ");
        double x3 = sc.nextDouble();

        System.out.print("Y3 = ");
        double y3 = sc.nextDouble();

        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("P = " + Math.round(p));
        System.out.println("S = " + Math.round(s));


    }
}
