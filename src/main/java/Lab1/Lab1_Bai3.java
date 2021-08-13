
// Viết chương trình nhập từ bàn phím cạnh của một khối lập phương.
// Tính và xuất thể tích của khối chữ nhật


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
