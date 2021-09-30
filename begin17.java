package Begin;

import java.util.Scanner;

public class begin17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        System.out.print("c = ");
        double c = sc.nextDouble();

        if (a < b && b < c) {
            double ac = c - a;
            double bc = c - b;
            double ab = b - a;
            double yigindi = ac + bc + ab;
            System.out.println("AC kesma uzunligi " + ac);
            System.out.println("BC kesma uzunligi " + bc);
            System.out.println("kesmalar uzunligi yig'indisi " + yigindi);
        } else {
            System.out.println("a < b < c formulasiga amal qiling");
        }

    }
}
