package tts.com;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {

        int[] array = {456, 566, 230, 478, 50, 10};
        int sum = 0;
        //Advanced for loop
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
    }
}
