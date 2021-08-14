
// Viet chuong trinh nhap tu ban phim canh cua mot khoi lap phuong.
// Tinh va xuat the tich cua khoi chu nhat


package Lab1;

import java.util.Scanner;

public class Lab1_Bai3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = in.nextDouble();
        System.out.printf("%.3f",Math.pow(a,3));
    }
}
