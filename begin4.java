package Begin;

import java.util.Scanner;

public class begin4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("d = ");
        double d = sc.nextDouble();
        double pi = Math.PI;
        double l = Math.round(pi * d);
        System.out.println("L = " + l);
    }
}
