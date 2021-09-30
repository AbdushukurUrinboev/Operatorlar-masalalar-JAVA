package Begin;

import java.util.Scanner;

public class begin8 {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);

        System.out.print("a = ");
        double a = sv.nextDouble();
        System.out.print("b = ");
        double b = sv.nextDouble();

        double s = (a + b) / 2;
        System.out.println("O'rta arifmetigi S = " + s);

    }
}
