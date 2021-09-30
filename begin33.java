package Begin;

import java.util.Scanner;

public class begin33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x kg = ");
        double x = sc.nextDouble();

        System.out.println("a so'm = ");
        double a = sc.nextDouble();

        System.out.println("y kg = ");
        double y = sc.nextDouble();

        double kg1 = a / x;
        double ykg = (a / x) * y;

        double birYkg = (a / x) + ((a / x) * y);

        System.out.println("1 kg = " + kg1);
        System.out.println("y kg = " + ykg);
        System.out.println("(1 + y) kg = " + birYkg);
    }
}
