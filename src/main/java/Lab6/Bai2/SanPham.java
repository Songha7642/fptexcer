package Lab6.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
    public String name;
    public double donGia;
    public String hang;

    public void nhap(){
        SanPham x = new SanPham();
        ArrayList<SanPham> list = new ArrayList<>();
        list.add(x);
        Scanner in = new Scanner(System.in);
        System.out.print("Ten san pham: ");
        x.name = in.nextLine();
        System.out.println("x.name =  " + x.name);

        System.out.print("Don gia: ");
        x.donGia = in.nextInt();
        System.out.println("x.donGia =  " + x.donGia);
        in.nextLine();

        System.out.print("Hang san pham: ");
        x.hang = in.nextLine();
        System.out.println("x.hang =" + x.hang);
    }

    public void xuat() {
        ArrayList<SanPham> list = new ArrayList<>();
        System.out.println("Danh sach san pham cua Nokia: ");
        for (int i = 1; i < 3; i++) {
                System.out.println("Ten san pham: " + list.get(i).name + " Don gia: " + list.get(i).donGia + " Hang: " + list.get(i).hang);
        }
    }
}
