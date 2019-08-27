package com.example.codingclass.week10.quiz;

import com.example.codingclass.week04.Student;

import java.util.Scanner;

public class Quiz {

    public void startQuiz() {

        //Student student1 = new Student();
        sayHello();
    }


    private void sayHello() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");

    }

}
