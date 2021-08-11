package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Bai3 {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum=0,count=0;
        int[] arr = new int[n];
          for(int i = 0; i<n;i++){
              arr[i] = in.nextInt();
          }
          for (int i:arr) {
              System.out.print(i+" ");
          }

        Arrays.sort(arr);
          System.out.println();
        for (int i: arr) {
            System.out.print(i+" ");
        }

        System.out.println("\n"+arr[0]);

        for (int i=0; i<n;i++) {
            if(arr[i]%3==0){
                sum+=arr[i];
                count++;
            }
        }
        System.out.printf("%.3f",(sum/count));
    }

}