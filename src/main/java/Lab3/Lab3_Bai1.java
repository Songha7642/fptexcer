
// Viet chuong trinh nhap mot so nguyen tu ban phim va cho biet so do co phai la so nguyen to hay khong
// (so nguyen to la so chi chia het cho 1 va chinh no).

package Lab3;

import java.util.Scanner;

public class Lab3_Bai1 {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = in.nextInt();
        boolean check = true;
          for (int i=2; i<n; i++){
              if(n%i ==0) {
                  check = false;
                  break;
              }
              i++;
          }
          System.out.println(check);
    }
}
