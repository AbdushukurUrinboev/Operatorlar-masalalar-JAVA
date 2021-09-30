package Begin;

import java.util.Scanner;

public class begin13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("R1 = ");
        double r1 = sc.nextDouble();
        System.out.print("R1 > R2.   R2 = ");
        double r2 = sc.nextDouble();
        if(r1 > r2) {
            double s1 = Math.PI * r1;
            System.out.println("S1 = " + Math.round(s1));

            double s2 = Math.PI * r2;
            System.out.println("S2 = " + Math.round(s2));

            double s3 = Math.PI * (r1 - r2);
            System.out.println("S3 = " + Math.round(s3));
        } else {
            System.out.println("Ilimos R1 > R2");
        }
    }
}
