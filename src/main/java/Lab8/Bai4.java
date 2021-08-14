package Lab8;


import java.util.Scanner;

import static Lab8.XPoly.*;

public class Bai4 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("\nVui long chon chuc nang: ");
        System.out.println("1. Tinh sum. ");
        System.out.println("2. Tim max,min. ");
        System.out.println("3. Chinh ten thanh in hoa. ");

        System.out.print("Answer= ");
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();

        switch (answer) {
            case 1:
                sum(2,5,9,4,1);
                break;
            case 2:
                min(2, 5, 4, 9, 7);
                max(2, 5, 4, 9, 7);
                break;
            case 3:
                toUpper();
                break;
        }
    }
}