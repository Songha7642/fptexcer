package Lab1;

import java.util.Scanner;

/*
  Viet chuong trinh nhap tu ban phim 2 canh cua hinh chu nhat. Tinh va xuat chu vi, dien tich va canh nho cua hinh chu nhat.
 */

public class Lab1_Bai2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a va b: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.printf("%.3f %.3f %.3f",(a+b)*2,a*b,Math.min(a,b));
    }
}
