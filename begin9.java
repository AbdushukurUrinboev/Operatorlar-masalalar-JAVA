package Begin;

import java.util.Scanner;

public class begin9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        double a = sc.nextDouble();
        System.out.println("b = ");
        double b = sc.nextDouble();
        double s = Math.sqrt(a * b);

        System.out.println("O'rta geometrigi S = " + s);
    }
}
