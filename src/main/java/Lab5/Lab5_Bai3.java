
// Xay dung ung dung quan ly san pham (thong tin moi san pham gom ten va gia) theo menu sau
//        1.	Nhap danh sach san pham tu ban phim
//        2.	Sap xep giam dan theo gia va xuat ra man hinh
//        3.	Tim va xoa san pham theo ten nhap tu ban phim
//        4.	Xuat gia trung binh cua cac san pham

package Lab5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Lab5_Bai3 {
       public  String name;
       public  double donGia;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("\nVui long chon chuc nang: ");
        System.out.println("1. Nhap danh sach. ");
        System.out.println("2. Sap xep giam dan theo gia va xuat danh sach. ");
        System.out.println("3. Tim va xoa san pham nhap tu ban phim. ");
        System.out.println("4. Xuat gia trung binh cua cac san pham. ");


        ArrayList<Lab5_Bai3> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        System.out.print("Answer= ");
        int answer = in.nextInt();

        System.out.print("Nhap so phan tu: ");
        int n = in.nextInt();

        switch (answer) {
            case 1:
                nhapDanhSach(n, list);
                break;
            case 2:
                xuatGiamDan(n,list);
                break;
            case 3:
                xoaSanPham(n, list);
            case 4:
                xuatGiaTrungBinh(n, list);
                break;
        }
    }

    public static void nhapDanhSach(int n, ArrayList<Lab5_Bai3> list) {
        System.out.print("Enter de nhap cac phan tu ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            in.nextLine();
            Lab5_Bai3 x = new Lab5_Bai3();
            System.out.print("Ten san pham: ");
            x.name = in.nextLine();
            System.out.print("Don gia: ");
            x.donGia = in.nextInt();
            list.add(x);
        }
    }

        public static void xuatGiamDan(int n, ArrayList<Lab5_Bai3> list ) {
            nhapDanhSach(n, list);
            Collections.sort(list, new Comparator<Lab5_Bai3>() {
                @Override
                public int compare(Lab5_Bai3 s1, Lab5_Bai3 s2) {
                    if (s1.donGia < s2.donGia) {
                        return 1;
                    } else {
                        if (s1.donGia == s2.donGia) {
                            return 0;
                        } else {
                            return -1;
                        }
                    }
                }
            });
            System.out.println("Danh sách giam dan: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Ten: " + list.get(i).name + ", Don gia: " + list.get(i).donGia);
            }

        }

    public static void xoaSanPham(int n, ArrayList<Lab5_Bai3> list) {
        nhapDanhSach(n, list);
        Scanner in = new Scanner(System.in);
        System.out.println("San pham can xoa: ");
        String nhap = in.nextLine();
        for (int i = 0; i < n; i++) {
            Lab5_Bai3 x = list.get(i);
            if (x.name.equals(nhap)) {
                list.remove(x);
            }

        }

        System.out.println("Danh sách moi: ");
        for (int i = 0; i < n; i++) {
            Lab5_Bai3 x = list.get(i);
            System.out.println("Ten san pham: " + x.name+"," + " Don gia: " + x.donGia);
        }
    }

    public static void xuatGiaTrungBinh(int n, ArrayList<Lab5_Bai3> list) {
        nhapDanhSach(n, list);
        int sum=0;
        int count=0;
            for (int i = 0; i < n; i++) {
                Lab5_Bai3 x = list.get(i);
                sum+=x.donGia;
                count++;
                System.out.println("Trung binh= "+sum/count);
            }
        }

    }


