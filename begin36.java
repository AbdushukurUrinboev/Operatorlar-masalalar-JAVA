package Begin;

import java.util.Scanner;

public class begin36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("V = ");
        double v1 = sc.nextDouble();

        System.out.println("V2 = ");
        double v2 = sc.nextDouble();

        System.out.println("T = ");
        double t = sc.nextDouble();

        double s1 = v1 * t;
        double s2 = v2 * t;
        double s = s1 + s2;

        System.out.print("S = " + s);
    }
}
