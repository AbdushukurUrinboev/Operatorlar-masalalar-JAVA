package Begin;

import java.util.Scanner;

public class begin6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();

        double v = a * b * c;
        double s = 2 * (a * b + b * c + a * c);
        System.out.println("V = " + v + ", S = " + s);

    }
}
