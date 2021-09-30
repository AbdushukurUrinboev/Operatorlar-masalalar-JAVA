package Begin;

import java.util.Scanner;

public class begin20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("X1 = ");
        double x1 = sc.nextDouble();

        System.out.print("Y1 = ");
        double y1 = sc.nextDouble();

        System.out.print("X2 = ");
        double x2 = sc.nextDouble();

        System.out.print("Y1 = ");
        double y2 = sc.nextDouble();

        double oradagiMasofa = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println(Math.round(oradagiMasofa));

    }
}
