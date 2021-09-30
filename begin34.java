package Begin;

import java.util.Scanner;

public class begin34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x kg shokolad = ");
        double xkg = sc.nextDouble();

        System.out.println("A sum = ");
        double a = sc.nextDouble();

        System.out.println("Y kg konfet= ");
        double ykg = sc.nextDouble();

        System.out.println("B sum = ");
        double b = sc.nextDouble();

        double kg1Shakar = a / xkg;
        double kg1Konfet = b / ykg;
        if (kg1Shakar > kg1Konfet) {
            double natija = kg1Shakar - kg1Konfet;
           System.out.println("1 kg Shokolad " + Math.round(natija) + " so'm qimmat 1 kg konfetdan");
        } else {
            System.out.println("Konfet qimmat");
        }
    }
}
