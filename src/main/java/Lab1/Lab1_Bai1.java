

 // Viet chuong trinh cho phep nhap ho va ten sinh vien, diem trung binh tu ban
 // phim sau do xuat ra man hinh voi dinh dang: <<ho va ten>> <<diem>> diem.

package Lab1;

import java.util.Scanner;

public class Lab1_Bai1 {
    public static void main (String[] args){
        String HovaTen;
        double diem;
           Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
             HovaTen = sc.nextLine();
        System.out.println("Nhap diem: ");
             diem = sc.nextDouble();
        System.out.printf("%s %f ",HovaTen,diem);
        System.out.println(("over"));
    }
}

