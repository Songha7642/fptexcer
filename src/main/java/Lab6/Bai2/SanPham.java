package Lab6.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
    public String name;
    public double donGia;
    public String hang;
    ArrayList<SanPham> list = new ArrayList<>();

    public void nhap() {
        SanPham x = new SanPham();
        Scanner in = new Scanner(System.in);
        System.out.print("\n Ten san pham: ");
        x.name = in.nextLine();


        System.out.print("Don gia: ");
        x.donGia = in.nextInt();

        in.nextLine();

        System.out.print("Hang san pham: ");
        x.hang = in.nextLine();


        list.add(x);
    }

    public void xuat() {
        System.out.println("\n Danh sach san pham cua Nokia: ");
        for(int i = 0; i < 5; i++) {
            SanPham x = list.get(i);
            if (x.hang.equals("Nokia")) {
                System.out.println("Ten san pham: " + x.name+"," + " Don gia: " + x.donGia + ","+ " Hang: " + x.hang);
            }
        }
    }
}
