package Lab6.Bai2;

import java.util.ArrayList;
import java.util.Scanner;


public class Display {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhan enter de bat dau: ");
        ArrayList<SanPham> list = new ArrayList<>();
        SanPham x = new SanPham();
        in.nextLine();

        for (int i = 1; i < 3; i++) {
            list.add(x);
            x.nhap();
            System.out.println(i);
        }
        for (int i = 1; i< 3; i++) list.get(i).xuat();
    }
}


