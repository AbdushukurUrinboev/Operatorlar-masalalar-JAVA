package Begin;

import java.util.Scanner;

public class begin11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();

        if(a != 0 && b != 0) {
            System.out.println(a + b);
            System.out.println(a * b);
            System.out.println("a ning moduli: " + Math.abs(a));
            System.out.println("b ning moduli: " + Math.abs(b));
        } else {
            System.out.println("Iltimos nolga teng bo'lmagan raqam kiriting");
        }
    }
}
