package Begin;

import java.util.Scanner;

public class begin27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a = ");
        double a = sc.nextDouble();

        System.out.println("A2 = " + Math.pow(a,2) + ", A4 = " + Math.pow(a,4) + ", A8 = " + Math.pow(a,8));
    }
}
