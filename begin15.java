package Begin;

import java.util.Scanner;

public class begin15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("S = ");
        double s = sc.nextDouble();

        double r = Math.sqrt(s / Math.PI);
        double d = 2 * r;

        System.out.println("R = " + Math.round(r));
        System.out.println("D = " + Math.round(d));
    }
}
