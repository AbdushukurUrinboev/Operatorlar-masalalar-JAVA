package Begin;

import java.util.Scanner;

public class begin5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        double v = Math.pow(a,3);
        double s = 6 * Math.pow(a, 2);
        System.out.print("V = " + v + ", S = " + s);
    }
}
