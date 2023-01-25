package Homework001;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите год: ");
        int year = iScanner.nextInt();
        iScanner.close();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Год високосный");
        }else {
            System.out.println("Год НЕ високосный");
        }



    }
}


