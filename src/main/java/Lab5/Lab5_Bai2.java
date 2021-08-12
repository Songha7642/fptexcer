package Lab5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Lab5_Bai2 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("\nVui long chon chuc nang: ");
        System.out.println("1. Nhap danh sach. ");
        System.out.println("2. Xuat danh sach vua nhap. ");
        System.out.println("3. Xuat danh sach ngau nhien. ");
        System.out.println("4. Sap xep giam dan va xuat danh sach. ");
        System.out.println("5. Tim va xoa ho ten nhap tu ban phim. ");
        System.out.println("6. Ket thuc: ");


        ArrayList<String> a = new ArrayList<>();
        System.out.print("Answer= ");
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
        System.out.print("Nhap so phan tu: ");
        int n = in.nextInt();

        switch (answer) {
            case 1:
                nhapDanhSach(n, a);
                break;
            case 2:
                xuatDanhSachVuaNhap(n, a);
                break;
            case 3:
                xuatNgauNhien(n, a);
                break;
            case 4:
                xuatGiamdan(n, a);
                break;
            case 5:
                xoaHoTen(n, a);
            case 6:
                System.exit(0);
        }
    }

    public static void nhapDanhSach(int n, ArrayList<String> a) {
        System.out.print("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            Scanner in = new Scanner(System.in);
            String x = in.nextLine();
            a.add(x);
        }
    }

    public static void xuatDanhSachVuaNhap(int n, ArrayList<String> a) {
        nhapDanhSach(n, a);
            for (int i = 0; i < n; i++) {
                String x = a.get(i);
                System.out.print(x + ", ");
            }
        }

    public static void xuatNgauNhien(int n, ArrayList<String> a) {
        nhapDanhSach(n, a);
        Collections.shuffle(a);
        System.out.println("Danh sách ngau nhien: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i) + ", ");
        }
    }

    public static void xuatGiamdan(int n, ArrayList<String> a) {
        nhapDanhSach(n, a);
        Collections.sort(a);
        Collections.reverse(a);
        System.out.println("Danh sách giam dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i) + ", ");
        }
    }

    public static void xoaHoTen(int n, ArrayList<String> a) {
        nhapDanhSach(n, a);
        Scanner in = new Scanner(System.in);
        System.out.println("Ho va ten can xoa: ");
        String nhap = in.nextLine();
        for (int i = 0; i < n; i++) {
            String x = a.get(i);
            if (nhap == x) {
                a.remove(x);
                System.out.print(a.get(i) + ", ");
                break;
            }
        }

        System.out.println("Danh sách moi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i) + ", ");
        }
    }

}


