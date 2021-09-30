package Begin;

import java.util.Scanner;

public class begin28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a = ");
        double a = sc.nextDouble();

        double a2 = Math.pow(a,2);
        double a3 = Math.pow(a,3);
        double a5 = Math.pow(a,5);
        double a10 = Math.pow(a,10);
        double a15 = Math.pow(a,15);

        System.out.println("A2 = " + a2);
        System.out.println("A3 = " + a3);
        System.out.println("A5 = " + a5);
        System.out.println("A10 = " + a10);
        System.out.println("A15 = " + a15);
    }
}
