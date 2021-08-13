
// Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số nguyên tố hay không
// (số nguyên tố là số chỉ chia hết cho 1 và chính nó).

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
