package Homework001;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {

        int[] myArray = new int[100];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1, 10);
        }

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число для отбора: ");
        int num = iScanner.nextInt();
        iScanner.close();

        int left = 0;
        int right = myArray.length - 1;

        while (left < right){
            if ((myArray[left] == num) && (myArray[right] == num)){
                right--;

            }else if ((myArray[left] == num) && (myArray[right] != num)){
                int tmp = myArray[right];
                myArray[right] = myArray[left];
                myArray[left] = tmp;
                left++;
                right--;

            } else if ((myArray[left] != num) && (myArray[right] != num)) {
                left++;

            }else if ((myArray[left] != num) && (myArray[right] == num)){
                left++;
            }
        }

        System.out.println(Arrays.toString(myArray)); // итоговый вывод массива




    }
}
