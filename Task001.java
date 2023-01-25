package Homework001;

import java.util.Random;
import java.util.Arrays;

public class Task001 {
    public static void main(String[] args) {

        int[] myArray = new int[100];
        int counter = 0;
        int maxLength = 0;
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }

        int maxItem = myArray[0];
        int minItem = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxItem){
                maxItem = myArray[i];
            }
        }

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minItem){
                minItem = myArray[i];
            }
        }

        System.out.println(Arrays.toString(myArray));

        System.out.println("Максимальный элемент массива: " + maxItem);
        System.out.println("Минимальный элемент массива: " + minItem);




    }
}
