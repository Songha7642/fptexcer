
// Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên
// và một chức năng để thoát khỏi ứng dụng.

package Lab2;

import java.util.Scanner;

public class Lab2_Bai4 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("1.Phuong trinh bac nhat.");
        System.out.println("2.Phuong trinh bac hai.");
        System.out.println("3.so dien. ");
        System.out.println("4.ket thuc. ");
        System.out.println("answer= ");
           Scanner in = new Scanner(System.in);
           int answer = in.nextInt();
           switch (answer) {
               case 1 : Phuong_trinh_bac_nhat();
               break;
               case 2 : Phuong_trinh_bac_hai();
               break;
               case 3 : sodien();
               break;
               case 4: System.exit(0);
           }
    }

    public static void Phuong_trinh_bac_nhat() {
        System.out.println("Nhap a va b:");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble();
        System.out.printf("Phuong trinh cua ban la: %.3f x + %.3f .",a,b);

        if (a == 0) {
            if (b == 0) {
                System.out.println("\n Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("\n Phuong trinh vo nghiem.");
            }
        }
        if (a != 0) {
            if (b == 0) {
                System.out.println("\n x=0.");
            } else {
                System.out.printf("\n x = %.3f.", (-b / a));
            }
        }
    }

    public static void Phuong_trinh_bac_hai() {
        System.out.println("Nhap a, b va c:");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double delta;
        System.out.printf("Phuong trinh cua ban la: %.3f x^2 + %.3f x + %.3f.",a,b,c);

        if (a != 0) {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("\n Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                System.out.printf("\n x1= x2= %.3f.", -b / (2 * a));
            } else {
                System.out.printf("\n x1 = %.3f va x2 = %.3f.", (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a));
            }
        }
        if (a == 0) {
            System.out.println("\n Tro ve phuong trinh bac nhat:");
            if (b == 0) {
                if (c == 0) {
                    System.out.println("\n Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("\n Phuong trinh vo nghiem.");
                }
            }
            if (b != 0) {
                if (c == 0) {
                    System.out.println("\n x = 0.");
                } else {
                    System.out.printf("\n x = %.3f.", (-c / b));
                }
            }
        }
    }

    public static void sodien(){
        Scanner in = new Scanner(System.in);
        double sodien = in.nextDouble();
        if(0<=sodien && sodien<=50){System.out.printf("\n %.3f",sodien*1000);}
        else if (sodien >50 ){System.out.printf("\n %.3f",(50*1000)+(sodien-50)*1200);}
    }

}
