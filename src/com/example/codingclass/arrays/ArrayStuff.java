package com.example.codingclass.arrays;

import java.util.Arrays;

public class ArrayStuff {


    public static void main(String[] args) {

        int[] numbers = {8, 1, 3, 2, 55, 4, 0, 9};
        bubbleSort(numbers);

        int i = 0;

        System.out.println(i++);
        System.out.println(++i);


    }

    static void bubbleSort(int[] arr) {
        /*
           we need to loop from the first element in the array [0] to the
           second to last element in the array . . . .
           i < [arr.length -1]
           which means "1 less than" [arr.length -1]
           which means = [arr.length -2]

           so if there are 8 numbers we want to loop from 0 (first element) to 6 (second to last element)
        */
        for (int i = 0; i < arr.length - 1; i++) {
            /*
              since we have switched numbers up to the last number, we know after the first pass that
              the last number is the largest so on subsequent loops we can loop 1 element less each time
              j < arr.length -i-1
              as i increases the max that j can be decreases so we go one element less for each loop
            */
            for (int j = 0; j < arr.length - i - 1; j++) {
                /*
                  check current value (arr[j]) against the next value (arr[j+1]) to see if they need to be swapped
                  we want the numbers in ascending order so if the current value is larger we will need to swap them
                */
                if (arr[j] > arr[j + 1]) {
                    /*
                      Here we swap the values
                      We need 3 buckets to swap the values
                      our "temporary" bucket holds the item in arr[j]
                      then we put the item from arr[j+1] into the arr[j] bucket
                      then we put the item from temp into the arr[j+1] bucket
                      now the values are switched
                    */
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // nope! prints object reference
        System.out.println(arr);

        // nope! prints object reference
        System.out.println(arr.toString());

        // this is the one we want! we could also write a loop and print each element
        System.out.println(Arrays.toString(arr));

    }

}


