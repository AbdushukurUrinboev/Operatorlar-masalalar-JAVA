package Begin;

import java.util.Scanner;

public class begin38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        double a = sc.nextDouble();

        System.out.print("B = ");
        double b = sc.nextDouble();

        if (a != 0) {
            double x = -(b / a);
            System.out.print("X = " + x);
        } else {
            System.out.println("A nolga teng bo'lmasin");
        }

    }
}
