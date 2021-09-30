package Begin;

import java.util.Scanner;

public class begin24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a = ");
        double a = sc.nextDouble();

        System.out.println("b = ");
        double b = sc.nextDouble();

        System.out.println("c = ");
        double c = sc.nextInt();

        double d = a;
        a = b;
        b = c;
        c = d;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
