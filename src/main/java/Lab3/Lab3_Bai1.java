package Lab3;

import java.util.Scanner;

public class Lab3_Bai1 {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
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
