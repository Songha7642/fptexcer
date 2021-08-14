
// Viet chuong trinh nhap mang so nguyen tu ban phim.
//     Sap xep va xuat mang vua nhap ra man hinh.
// 	Xuat phan tu co gia tri nho nhat ra man hinh
// 	Tinh va xuat ra man hinh trung binh cong cac phan tu chia het cho 3

package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Bai3 {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap tong so phan tu: ");
        int n = in.nextInt();
        double sum = 0, count = 0;
        int[] arr = new int[n];
        System.out.println("Nhap phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Mang gom: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        Arrays.sort(arr);
        System.out.println();
        System.out.println("Mang tang dan: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n Phan tu nho nhat: ");
        System.out.println(arr[0]);

        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong co phan tu nao chia het cho 3 trong mang");
        } else {
            System.out.printf("Trung binh cac phan tu chia het cho 3 = %.3f", (sum / count));
        }
    }

}