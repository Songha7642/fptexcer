
// Viet chuong trinh nhap cac he so cua phuong trinh bac 2.
// Tinh delta va xuat can delta ra man hinh.

package Lab1;

import java.util.Scanner;

public class Lab1_Bai4 {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap a, b va c: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double delta = Math.pow(a,2) - 4*a*c;
        System.out.printf("%.3f",Math.sqrt(Math.abs(delta)));
    }
}
