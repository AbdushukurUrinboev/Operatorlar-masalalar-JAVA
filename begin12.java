package Begin;

import java.util.Scanner;

public class begin12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        double p = a + b + c;
        System.out.println("c = " + Math.round(c));
        System.out.println("P = " + Math.round(p));
    }
}
