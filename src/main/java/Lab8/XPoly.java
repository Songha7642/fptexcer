
//  Tao lop final co ten la XPoly va bo sung cac phuong thuc tinh va viet ma theo yeu
//  cau cua cac bai sau day.

package Lab8;

import java.util.Scanner;

public final class XPoly {

    // Bai 1 : Them mot phuong thuc tinh co ten la sum() voi tham so bien doi kieu double.
    // Viet ma cho phuong thuc nay de thuc hien tinh tong cac tham so truyen vao.
    public static double sum (double...x){
        double s=0;
        for (int i = 0; i<x.length;i++){
            s+= x[i];
        }
        System.out.println("Sum = "+s);
        return 0;
    }


    // Bai 2:  Bo sung them 2 phuong thuc tinh de tim so lon nhat va nho nhat tu tham so bien doi
    public static double min (double...x) {
        double mi = x[0];
        for (int i = 0; i<x.length;i++){
            if (x[i]<mi) mi = x[i];
        }
        System.out.println("Min = "+mi);
        return 0;
    }

     // Bai 2
    public static double max (double...x) {
        double ma = x[0];
        for (int i = 0; i<x.length;i++){
            if (x[i]>ma) ma = x[i];
        }
        System.out.println("Max = "+ma);
        return 0;
    }


     // Bai 3 :  Bo sung them 1 phuong thuc tinh toUpperFirstChar(String s)
     // de chuyen doi cac ky tu dau tien cua moi tu sang ky tu hoa. Vi du: “nguyen van teo” se doi thanh “Nguyen Van Teo”.
    public static void toUpper (){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String s = in.nextLine();

        String[] words = s.split(" ");
         for (int i = 0; i<words.length; i++) {
             char firstChar = words[i].charAt(0);
             String upperFirstChar = String.valueOf(firstChar).toUpperCase();
             words[i] = upperFirstChar + words[i].substring(1);
         }
         String ss = String.join(" ", words);
        System.out.println("Ten sau khi chinh: "+ ss);
    }

}
