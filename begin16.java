package Begin;

import java.util.Scanner;

public class begin16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("X1 = ");
        double x1 = sc.nextDouble();

        System.out.println("X2 > x1.   X2 = ");
        double x2 = sc.nextDouble();

        if (x2 > x1) {
            System.out.println(Math.abs(x2 - x1));
        } else {
            System.out.println("Iltimos X2 > X1");
        }
    }
}
