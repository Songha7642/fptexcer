
// Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b nhập từ bàn phím

package Lab2;

import java.util.Scanner;

public class Lab2_Bai2 {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap a, b va c: ");
        double a= in.nextDouble(), b=in.nextDouble(), c=in.nextDouble();
        double delta;
        if(a!=0){
            delta = b*b - 4*a*c;
              if(delta < 0){System.out.println("Phuong trinh vo nghiem");}
              else if(delta == 0) {System.out.printf("x1= x2= %.3f",-b/(2*a));}
              else {System.out.printf("x1= %.3f va x2= %.3f",(-b+Math.sqrt(delta))/(2*a), (-b-Math.sqrt(delta))/(2*a));}
        }
        if(a==0){ System.out.println("Tro ve phuong trinh bac nhat");
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            }
            if (b != 0) {
                if (c == 0) {
                    System.out.println("x=0");
                } else {
                    System.out.printf("x = %.3f", (-c / b));
                }
            }
        }
    }
}
