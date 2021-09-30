package Begin;

import java.util.Scanner;

public class begin37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("V1 = ");
        double v1 = sc.nextDouble();

        System.out.print("V2 = ");
        double v2 = sc.nextDouble();

        System.out.print("T = ");
        double t = sc.nextDouble();

        double s1 = v1 * t;
        double s2 = v2 * t;
        double s = s1 + s2;

        System.out.print("S = " + s);
    }
}
