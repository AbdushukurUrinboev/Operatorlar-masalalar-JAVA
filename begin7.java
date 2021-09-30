package Begin;

import java.util.Scanner;

public class begin7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("r = ");
        double r = sc.nextDouble();
        double l = 2 * Math.PI * r;
        double s = Math.PI * Math.pow(r, 2);

        System.out.println("L = " + l + "S = " + s);

    }
}
