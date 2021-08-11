package Lab4.Bai1;

import java.util.Scanner;

public class SanPham {
        public String name;
        public double donGia;
        public double giamGia;

        public void nhap(){
            Scanner in = new Scanner(System.in);
            System.out.println("Nhap ten san pham: ");
            name = in.nextLine();
            System.out.println("Nhap don gia: ");
            donGia = in.nextDouble();
            System.out.println("Nhap giam gia: ");
            giamGia = in.nextDouble();
        }

        public void xuat(){
            System.out.printf("\n Ten san pham: %s",name);
            System.out.printf("\n Don gia: %.2f",donGia);
            System.out.printf("\n Giam gia: %.2f",giamGia);
            System.out.printf("\n Thue nhap khau: %.2f",getThueNhapKhau());
        }
        public double getThueNhapKhau(){
            return 0.1*donGia;
        }
    }


