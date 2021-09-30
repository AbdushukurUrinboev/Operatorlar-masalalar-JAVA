package Begin;

import java.util.Scanner;

public class begin25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x = ");
        double x = sc.nextDouble();

        double y = 3 * Math.pow(x,6) - 6 * Math.pow(x,2) - 7;

        System.out.println("y = " + y);

    }
}
