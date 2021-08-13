
// Nhập danh sách số thực với số lượng tùy ý từ bàn phím sau đó xuất danh sách vừa nhập và tổng của nó.

package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5_Bai1 {
    public static void main (String []args){
        double sum=0;
        ArrayList <Double> a = new ArrayList <>();
        Scanner in = new Scanner(System.in);
        System.out.print( "Nhap tong so phan tu: ");
        int n = in.nextInt();
        System.out.print( "Nhap cac phan tu: ");
        for(int i =0; i<n;i++) {
            Double x = in.nextDouble();
            a.add(x);
        }
        for (Double x : a) {
            System.out.print(x + " ");
        }
        for (Double x : a) {
             sum += x;
        }
        System.out.print("\n Sum = " +sum);
    }

}
