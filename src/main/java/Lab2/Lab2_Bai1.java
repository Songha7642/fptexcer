package Lab2;

import java.util.Scanner;

public class Lab2_Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
        if (a != 0) {
            if (b == 0) {
                System.out.println("x=0");
            } else {
                System.out.printf("%.3f", (-b / a));
            }
        }
    }
}
