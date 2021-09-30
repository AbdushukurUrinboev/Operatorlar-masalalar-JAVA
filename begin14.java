package Begin;

import java.util.Scanner;

public class begin14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("L = ");
        double l = sc.nextDouble();

        double r = l /(Math.PI * 2);
        double s = Math.PI * Math.pow(r, 2);

        System.out.println("R = " + Math.round(r));
        System.out.println("S = " + Math.round(s));
    }
}
