package Begin;

import java.util.Scanner;

public class begin22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a = ");
        double a = sc.nextDouble();

        System.out.println("b = ");
        double b = sc.nextDouble();
        double c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
