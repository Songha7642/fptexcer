

 // Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn
 // phím sau đó xuất ra màn hình với định dạng: <<họ và tên>> <<điểm>> điểm.

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

