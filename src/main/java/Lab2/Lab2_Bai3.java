
// Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo phương pháp lũy tiến

package Lab2;

import java.util.Scanner;

public class Lab2_Bai3 {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        double sodien = in.nextDouble();
         if(0<=sodien && sodien<=50){System.out.printf("%.3f",sodien*1000);}
         else if (sodien >50 ){System.out.printf("%.3f",(50*1000)+(sodien-50)*1200);}
    }
}
