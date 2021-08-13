
// Nhập họ và tên từ bàn phím. Xuất tên, họ và tên đệm ra màn hình trong đó
// tên và họ xuất IN HOA.

package Lab6;

import java.util.Scanner;

public class Lab6_Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String name = in.nextLine();
        name.indexOf(" ");
        System.out.println((name.substring(name.lastIndexOf(" ") + 1)).toUpperCase());
        System.out.println((name.substring(0,name.indexOf(" "))).toUpperCase());
        System.out.println((name.substring(name.indexOf(" ")+1 ,name.lastIndexOf(" ") + 1)) );
    }
}