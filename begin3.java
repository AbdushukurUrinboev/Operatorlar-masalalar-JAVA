package Begin;

import java.util.Scanner;

public class begin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        double s = a * b;
        double p = 2 * (a + b);
        System.out.println(" S = " + s + ", P = " + p);
    }
}
