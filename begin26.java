package Begin;

import java.util.Scanner;

public class begin26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x = ");
        double x = sc.nextDouble();

        double y = 4 * Math.pow((x - 3), 6) - 7 * Math.pow((x - 3), 3) + 2;

        System.out.println("y = " + y);
    }
}
