package com.example.codingclass.week1.fizzbuzz;

public class FizzBuzz {

    /*
    Homework: loop through numbers 1-50
        if it's divisible by 3 print fizz
        if it's divisible by 5 print buzz
        if it's divisible by 3 and 5 print fizz buzz
        otherwise print the number
    */

    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String FIZZ_BUZZ = "fizz buzz";

    private static final int FIZZ_FACTOR = 3;
    private static final int BUZZ_FACTOR = 5;

    public static void main(String[] args) {
        // don't put a lot in main; keep it uncluttered
        int start = 1;
        int end = 50;
        processNumbers(start, end);
    }

    private static void processNumbers(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (isFizzable(i) && isBuzzable(i)) {
                print(FIZZ_BUZZ);
            } else if (isFizzable(i)) {
                print(FIZZ);
            } else if (isBuzzable(i)) {
                print(BUZZ);
            } else {
                print(i);
            }
        }

    }

    private static boolean isFizzable(int number) {
        // predicate function; returns a true or false
        return number % FIZZ_FACTOR == 0;
    }

    private static boolean isBuzzable(int number) {
        // predicate function; returns a true or false
        return number % BUZZ_FACTOR == 0;
    }

    private static void print(int message){
        print(Integer.toString(message));
    }

    private static void print(String message){
        System.out.println(message);
    }

}
