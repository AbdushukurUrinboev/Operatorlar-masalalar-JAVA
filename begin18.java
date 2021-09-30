package Begin;

import java.util.Scanner;

public class begin18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        double a = sc.nextDouble();

        System.out.print("C = ");
        double c = sc.nextDouble();

        System.out.print("B = ");
        double b = sc.nextDouble();

        if (a < c && c < b) {
            double ac = c - a;
            double bc = b - c;

            System.out.println(ac * bc);
        } else {
            System.out.println("A < C < B formulasiga amal qiling");
        }



    }
}
