package Begin;

import java.util.Scanner;

public class begin31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tf ni kiriting = ");
        double tf = sc.nextDouble();

        double tc = (tf - 32) * 5 / 9;
        System.out.println("Tc = " + tc);
    }
}
