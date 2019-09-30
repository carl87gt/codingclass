package com.example.codingclass.fizzbuzz;


import static com.example.codingclass.misc.util.Constants.NETWORK_GOOD_SPEED;

public class LoopsIfs {


    public static void main(String[] args) {
        System.out.println("hello world");

        for (int count = 0; count < 9; count++) {
            System.out.println(count);
        }


        int networkSpeed = 5555;

        if (networkSpeed < NETWORK_GOOD_SPEED) {

        }

    }


    void bark() {
        int size = (int) (Math.random() * 100);
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }

}


