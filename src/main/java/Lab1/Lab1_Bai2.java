package Lab1;

import java.util.Scanner;

public class Lab1_Bai2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.printf("%.3f %.3f %.3f",(a+b)*2,a*b,Math.min(a,b));
    }
}
