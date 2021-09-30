package Begin;

import java.util.Scanner;

public class begin35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("V = ");
        double v = sc.nextDouble();

        System.out.println(" U < V.    U = ");
        double u = sc.nextDouble();

        System.out.println("T1 = ");
        double t1 = sc.nextDouble();

        System.out.println("T2 = ");
        double t2 = sc.nextDouble();

        double s = (v + u) * t1;
        System.out.println("S = " + s);


    }
}
