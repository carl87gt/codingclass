package com.example.codingclass.quiz.assignment.domain;

public class Person {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculateAgeInDogYears(){
        return age * 7;
    }

    public static String convertStringToUppercase(String s){
        return s.toUpperCase();
    }

}
