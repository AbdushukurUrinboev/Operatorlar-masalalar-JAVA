package Begin;

import java.util.Scanner;

public class begin10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();

        if(a > 0 && b > 0) {
            double yigindi = a + b;
            double kupaytma = a * b;
            double aKvadrat = Math.pow(a, 2);
            double bKvadrat = Math.pow(b,2);

            System.out.println("yig'indi: " + yigindi);
            System.out.println("Ko'paytma: " + kupaytma);
            System.out.println("a ning kvadrati: " + aKvadrat);
            System.out.println("b ning kvadrati: " + bKvadrat);

        } else {
            System.out.println("Kiritgan raqamingiz noldan kichik. Iltimos noldan katta raqam kiriting");
        }
    }
}
